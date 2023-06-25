package com.example.llamita_finance_backend.controllers;
import com.example.llamita_finance_backend.models.PaymentModel;
import com.example.llamita_finance_backend.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping()
    public ArrayList<PaymentModel> getPayment(){
        return paymentService.getPayment();
    }

    @PostMapping()
    public PaymentModel saveUser(@RequestBody PaymentModel payment){
        return this.paymentService.savePayment(payment);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        boolean ok = this.paymentService.deletePayment(id);
        if (ok){
            return "User with id: " + id + " was deleted";
        }else{
            return "Can´t delete user with id: " + id;
        }
    }
}
