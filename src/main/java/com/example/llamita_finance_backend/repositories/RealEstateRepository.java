package com.example.llamita_finance_backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.llamita_finance_backend.models.RealEstateModel;

@Repository
public interface RealEstateRepository extends CrudRepository<RealEstateModel, Long> {
}
