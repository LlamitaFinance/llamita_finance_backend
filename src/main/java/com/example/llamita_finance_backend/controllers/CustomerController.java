package com.example.llamita_finance_backend.controllers;

import com.example.llamita_finance_backend.models.CustomerModel;
import com.example.llamita_finance_backend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ArrayList<CustomerModel> getCustomer(){
        return customerService.getCustomer();
    }

    @PostMapping()
    public CustomerModel saveUser(@RequestBody CustomerModel customer){
        return this.customerService.saveCustomer(customer);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        boolean ok = this.customerService.deleteCustomer(id);
        if (ok){
            return "User with id: " + id + " was deleted";
        }else{
            return "Can´t delete user with id: " + id;
        }
    }
}
