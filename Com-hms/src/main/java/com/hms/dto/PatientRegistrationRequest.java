package com.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientRegistrationRequest {
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank(message = "First name is required")
    private String firstName;
    @NotBlank(message = "Last name is required")
    private String lastName;
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;
    @NotNull(message = "Date of birth is required")
    private LocalDate dateOfBirth;
    @NotBlank(message = "Gender is required")
    private String gender;
    @NotBlank(message = "Blood group is required")
    private String bloodGroup;
    private String address;
    private String medicalHistory;
    private String allergies;
    @NotBlank(message = "Emergency contact is required")
    private String emergencyContact;
}