package com.hms.repository;

import com.hms.entity.Appointment;
import com.hms.enums.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long patientId);
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByStatus(AppointmentStatus status);
    List<Appointment> findByAppointmentDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Appointment> findByPatientIdAndStatus(Long patientId, AppointmentStatus status);
}