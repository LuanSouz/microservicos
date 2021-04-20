package com.hr.payroll.payroll.controller;

import com.hr.payroll.payroll.entity.Payment;
import com.hr.payroll.payroll.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/{workerId}/day/{days}", method = GET)
    public ResponseEntity<Payment> getPayment(@PathVariable Integer workerId, @PathVariable Integer days){
        Payment payment = paymentService.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

}