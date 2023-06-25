package com.example.llamita_finance_backend.controllers;

import com.example.llamita_finance_backend.models.RealEstateModel;
import com.example.llamita_finance_backend.services.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class RealEstateController {
    @Autowired
    RealEstateService realEstateService;

    @GetMapping()
    public ArrayList<RealEstateModel> getUser(){
        return realEstateService.getUser();
    }

    @PostMapping()
    public RealEstateModel saveUser(@RequestBody RealEstateModel user){
        return this.realEstateService.saveUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        boolean ok = this.realEstateService.deleteUser(id);
        if (ok){
            return "User with id: " + id + " was deleted";
        }else{
            return "Can´t delete user with id: " + id;
        }
    }

}