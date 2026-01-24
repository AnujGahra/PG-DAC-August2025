package com.socialfarmer.backend.dto;

import com.socialfarmer.backend.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String fullName;
    private String phoneNumber;
    private Role role; // Optional, defaults to FARMER if null
    private String place; // Optional
    private String cropType; // Optional
    // OTP logic to be handled in service (simulation)
}
