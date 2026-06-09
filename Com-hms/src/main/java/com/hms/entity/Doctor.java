package com.hms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "doctors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(nullable = false)
    private String licenseNumber;
    @Column(nullable = false)
    private String specialization;
    @Column(columnDefinition = "TEXT")
    private String qualifications;
    @Column(nullable = false)
    private String department;
    @Column(nullable = false)
    private Double consultationFee;
    @Column(columnDefinition = "TEXT")
    private String availabilitySchedule;
    @Column(nullable = false)
    private Boolean active = true;
    @Column(nullable = false)
    private Long createdAt = System.currentTimeMillis();
    @Column(nullable = false)
    private Long updatedAt = System.currentTimeMillis();
}