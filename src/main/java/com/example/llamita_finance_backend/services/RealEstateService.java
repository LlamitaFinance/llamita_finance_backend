package com.example.llamita_finance_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.llamita_finance_backend.models.RealEstateModel;
import com.example.llamita_finance_backend.repositories.RealEstateRepository;

import java.util.ArrayList;

@Service
public class RealEstateService {

    @Autowired
    RealEstateRepository realEstateRepository;

    public ArrayList<RealEstateModel> getUser(){
        return (ArrayList<RealEstateModel>) realEstateRepository.findAll();
    }

    public RealEstateModel saveUser(RealEstateModel user){
        return realEstateRepository.save(user);
    }

    public boolean deleteUser(Long id){
        try {
            realEstateRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}