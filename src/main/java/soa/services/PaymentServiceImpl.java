package soa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soa.model.Payment;
import soa.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
