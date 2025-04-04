package com.example.Payment.Gateway.controller;

import com.example.Payment.Gateway.service.RazorPayService;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private RazorPayService razorPayService;

    @Autowired
    public PaymentController( RazorPayService razorPayService) {
        this.razorPayService = razorPayService;
    }

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestParam int amount,@RequestParam String currency)
    {
        try {
            return new ResponseEntity<>(razorPayService.createOrder(amount,currency,"receiptId-1234"), HttpStatus.CREATED);
        } catch (RazorpayException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
