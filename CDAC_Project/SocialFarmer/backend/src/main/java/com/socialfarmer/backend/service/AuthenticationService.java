package com.socialfarmer.backend.service;

import com.socialfarmer.backend.config.JwtService;
import com.socialfarmer.backend.dto.AuthRequest;
import com.socialfarmer.backend.dto.AuthResponse;
import com.socialfarmer.backend.dto.RegisterRequest;
import com.socialfarmer.backend.model.Role;
import com.socialfarmer.backend.model.User;
import com.socialfarmer.backend.model.UserStatus;
import com.socialfarmer.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthResponse register(RegisterRequest request) {
        // Default role is FARMER if not provided
        Role role = request.getRole() != null ? request.getRole() : Role.FARMER;
        
        // Status: ADMIN -> APPROVED, FARMER -> PENDING
        UserStatus status = (role == Role.ADMIN) ? UserStatus.APPROVED : UserStatus.PENDING;

        // OTP Simulation: We set a fixed password "1234" for everyone or use the OTP provided in real scenario.
        // For security compatibility, we hash "1234" as their password.
        String dummyOtpPassword = "1234"; 

        var user = User.builder()
                .fullName(request.getFullName())
                .phoneNumber(request.getPhoneNumber())
                .place(request.getPlace())
                .cropType(request.getCropType())
                .password(passwordEncoder.encode(dummyOtpPassword)) 
                .role(role)
                .status(status)
                .build();
        
        repository.save(user);
        
        // Return message
        if (role == Role.FARMER) {
            return AuthResponse.builder()
                    .message("Registration successful. Please wait for Admin approval.")
                    .build(); 
        }

        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(jwtToken)
                .message("Registration successful.")
                .build();
    }

    public AuthResponse authenticate(AuthRequest request) {
        // OTP Simulation: We assume the user enters "1234" as OTP.
        // In a real app, we would verify the OTP against cache/db.
        // Here we just authenticate using the stored hashed password.
        
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getPhoneNumber(),
                        request.getOtp() // Should be "1234"
                )
        );
        
        var user = repository.findByPhoneNumber(request.getPhoneNumber())
                .orElseThrow();
        
        if (user.getStatus() != UserStatus.APPROVED && user.getRole() != Role.ADMIN) {
             throw new RuntimeException("Admin has not approved your account yet");
        }

        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(jwtToken)
                .message("Login successful")
                .build();
    }
}
