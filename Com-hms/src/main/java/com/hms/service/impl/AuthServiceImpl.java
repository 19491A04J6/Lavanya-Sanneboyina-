package com.hms.service.impl;

import com.hms.dto.LoginRequest;
import com.hms.dto.LoginResponse;
import com.hms.dto.PatientRegistrationRequest;
import com.hms.entity.Patient;
import com.hms.entity.Role;
import com.hms.entity.User;
import com.hms.exception.ResourceNotFoundException;
import com.hms.repository.PatientRepository;
import com.hms.repository.RoleRepository;
import com.hms.repository.UserRepository;
import com.hms.service.AuthService;
import com.hms.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()
                    )
            );

            User user = userRepository.findByUsername(loginRequest.getUsername())
                    .orElseThrow(() -> new ResourceNotFoundException("User", "username", loginRequest.getUsername()));

            String token = jwtTokenUtil.generateToken(user.getUsername());
            Set<String> roles = user.getRoles().stream()
                    .map(Role::getRoleName)
                    .collect(Collectors.toSet());

            LoginResponse response = new LoginResponse();
            response.setUserId(user.getId());
            response.setUsername(user.getUsername());
            response.setEmail(user.getEmail());
            response.setToken(token);
            response.setRoles(roles);
            response.setSuccess(true);
            response.setMessage("Login successful");

            return response;
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Invalid username or password", e);
        }
    }

    @Override
    public LoginResponse patientRegistration(PatientRegistrationRequest registrationRequest) {
        if (userRepository.existsByUsername(registrationRequest.getUsername())) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepository.existsByEmail(registrationRequest.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setUsername(registrationRequest.getUsername());
        user.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
        user.setEmail(registrationRequest.getEmail());
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setPhoneNumber(registrationRequest.getPhoneNumber());
        user.setActive(true);

        Role patientRole = roleRepository.findByRoleName("PATIENT")
                .orElseThrow(() -> new ResourceNotFoundException("Role", "name", "PATIENT"));
        Set<Role> roles = new HashSet<>();
        roles.add(patientRole);
        user.setRoles(roles);

        User savedUser = userRepository.save(user);

        Patient patient = new Patient();
        patient.setUser(savedUser);
        patient.setDateOfBirth(registrationRequest.getDateOfBirth());
        patient.setGender(registrationRequest.getGender());
        patient.setAddress(registrationRequest.getAddress());
        patient.setBloodGroup(registrationRequest.getBloodGroup());
        patient.setMedicalHistory(registrationRequest.getMedicalHistory());
        patient.setAllergies(registrationRequest.getAllergies());
        patient.setEmergencyContact(registrationRequest.getEmergencyContact());
        patient.setActive(true);

        patientRepository.save(patient);

        String token = jwtTokenUtil.generateToken(savedUser.getUsername());

        LoginResponse response = new LoginResponse();
        response.setUserId(savedUser.getId());
        response.setUsername(savedUser.getUsername());
        response.setEmail(savedUser.getEmail());
        response.setToken(token);
        response.setRoles(roles.stream().map(Role::getRoleName).collect(Collectors.toSet()));
        response.setSuccess(true);
        response.setMessage("Patient registration successful");

        return response;
    }

    @Override
    public Boolean validateToken(String token) {
        return jwtTokenUtil.validateToken(token);
    }

    @Override
    public String getUsernameFromToken(String token) {
        return jwtTokenUtil.getUsernameFromToken(token);
    }
}