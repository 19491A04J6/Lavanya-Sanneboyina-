package com.hms.service;

import com.hms.dto.LoginRequest;
import com.hms.dto.LoginResponse;
import com.hms.dto.PatientRegistrationRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse patientRegistration(PatientRegistrationRequest registrationRequest);
    Boolean validateToken(String token);
    String getUsernameFromToken(String token);
}