package com.hms.service;

import com.hms.dto.PatientResponse;
import java.util.List;

public interface PatientService {
    PatientResponse getPatientById(Long id);
    PatientResponse getPatientByUserId(Long userId);
    List<PatientResponse> getAllPatients();
    PatientResponse updatePatient(Long id, PatientResponse patientResponse);
    void deletePatient(Long id);
}