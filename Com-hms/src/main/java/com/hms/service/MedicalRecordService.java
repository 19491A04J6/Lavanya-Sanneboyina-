package com.hms.service;

import com.hms.entity.MedicalRecord;
import java.util.List;

public interface MedicalRecordService {
    MedicalRecord createMedicalRecord(MedicalRecord medicalRecord);
    MedicalRecord getMedicalRecordById(Long id);
    List<MedicalRecord> getMedicalRecordsByPatient(Long patientId);
    List<MedicalRecord> getMedicalRecordsByDoctor(Long doctorId);
    List<MedicalRecord> getMedicalRecordsByAppointment(Long appointmentId);
    MedicalRecord updateMedicalRecord(Long id, MedicalRecord medicalRecord);
    void deleteMedicalRecord(Long id);
    List<MedicalRecord> getAllMedicalRecords();
}