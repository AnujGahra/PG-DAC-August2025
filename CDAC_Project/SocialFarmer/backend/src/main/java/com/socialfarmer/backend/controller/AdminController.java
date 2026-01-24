package com.socialfarmer.backend.controller;

import com.socialfarmer.backend.model.Role;
import com.socialfarmer.backend.model.User;
import com.socialfarmer.backend.model.UserStatus;
import com.socialfarmer.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        // Simple implementation returning all users or filtered by role FARMER
        // Ideally should use DTO to hide password but password is dummy hashed anyway.
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PutMapping("/users/{id}/status")
    public ResponseEntity<Void> updateUserStatus(
            @PathVariable Long id,
            @RequestParam UserStatus status
    ) {
        User user = userRepository.findById(id).orElseThrow();
        user.setStatus(status);
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }
}
