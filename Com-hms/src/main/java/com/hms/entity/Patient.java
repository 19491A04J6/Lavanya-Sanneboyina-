package com.hms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @Column(nullable = false)
    private String gender;
    @Column(columnDefinition = "TEXT")
    private String address;
    @Column(nullable = false)
    private String bloodGroup;
    @Column(columnDefinition = "TEXT")
    private String medicalHistory;
    @Column(columnDefinition = "TEXT")
    private String allergies;
    @Column(nullable = false)
    private String emergencyContact;
    @Column(nullable = false)
    private Boolean active = true;
    @Column(nullable = false)
    private Long createdAt = System.currentTimeMillis();
    @Column(nullable = false)
    private Long updatedAt = System.currentTimeMillis();
}