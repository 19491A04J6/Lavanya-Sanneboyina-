package com.hms.entity;

import com.hms.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bills")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
    @Column(nullable = false)
    private Double consultationFee;
    @Column(nullable = false)
    private Double medicineCost;
    @Column(nullable = false)
    private Double labTestCost;
    @Column(nullable = false)
    private Double totalAmount;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus paymentStatus;
    @Column(nullable = false)
    private LocalDateTime billDate;
    @Column
    private LocalDateTime paymentDate;
    @Column(columnDefinition = "TEXT")
    private String notes;
    @Column(nullable = false)
    private Long createdAt = System.currentTimeMillis();
    @Column(nullable = false)
    private Long updatedAt = System.currentTimeMillis();
}