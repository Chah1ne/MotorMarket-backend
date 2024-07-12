package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soa.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
