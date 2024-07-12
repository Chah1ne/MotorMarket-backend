package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soa.model.Payment;
import soa.services.PaymentService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/payments")
public class PaymentRESTController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentRESTController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

}
