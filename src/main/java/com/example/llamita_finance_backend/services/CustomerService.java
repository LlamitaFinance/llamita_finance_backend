package com.example.llamita_finance_backend.services;

import com.example.llamita_finance_backend.models.CustomerModel;
import com.example.llamita_finance_backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public ArrayList<CustomerModel> getCustomer(){
        return (ArrayList<CustomerModel>) customerRepository.findAll();
    }

    public CustomerModel saveCustomer(CustomerModel customer){
        return customerRepository.save(customer);
    }

    public boolean deleteCustomer(Long id){
        try {
            customerRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
