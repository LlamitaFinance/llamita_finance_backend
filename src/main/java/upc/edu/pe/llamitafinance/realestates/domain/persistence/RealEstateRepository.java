package upc.edu.pe.llamitafinance.realestates.domain.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.llamitafinance.realestates.domain.model.entity.RealEstate;

import java.util.List;

public interface RealEstateRepository extends JpaRepository<RealEstate, Long>{
    @Override
    List<RealEstate> findAll();
}
