package upc.edu.pe.llamitafinance.realestates.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import upc.edu.pe.llamitafinance.realestates.domain.model.entity.RealEstate;

import java.util.List;

public interface RealEstateService {

    List<RealEstate> getAll();

    Page<RealEstate> getAll(Pageable pageable);

    RealEstate getById(Long RealEstateId);

    RealEstate create(RealEstate realEstate);
}
