package com.hms.repository;

import com.hms.entity.Bill;
import com.hms.enums.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByPatientId(Long patientId);
    List<Bill> findByPaymentStatus(PaymentStatus paymentStatus);
    List<Bill> findByPatientIdAndPaymentStatus(Long patientId, PaymentStatus paymentStatus);
}