package com.example.llamita_finance_backend.services;

import com.example.llamita_finance_backend.models.PaymentModel;
import com.example.llamita_finance_backend.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public ArrayList<PaymentModel> getPayment(){
        return (ArrayList<PaymentModel>) paymentRepository.findAll();
    }

    public PaymentModel savePayment(PaymentModel payment){
        return paymentRepository.save(payment);
    }

    public boolean deletePayment(Long id){
        try {
            paymentRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}