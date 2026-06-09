package com.hms.service;

import com.hms.dto.AppointmentRequest;
import com.hms.dto.AppointmentResponse;
import com.hms.enums.AppointmentStatus;
import java.util.List;

public interface AppointmentService {
    AppointmentResponse createAppointment(AppointmentRequest appointmentRequest);
    AppointmentResponse getAppointmentById(Long id);
    List<AppointmentResponse> getAppointmentsByPatient(Long patientId);
    List<AppointmentResponse> getAppointmentsByDoctor(Long doctorId);
    List<AppointmentResponse> getAppointmentsByStatus(AppointmentStatus status);
    AppointmentResponse updateAppointment(Long id, AppointmentRequest appointmentRequest);
    AppointmentResponse updateAppointmentStatus(Long id, AppointmentStatus status);
    void deleteAppointment(Long id);
    List<AppointmentResponse> getAllAppointments();
}