package upc.edu.pe.llamitafinance.realestates.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import upc.edu.pe.llamitafinance.realestates.domain.model.entity.RealEstate;
import upc.edu.pe.llamitafinance.realestates.domain.persistence.RealEstateRepository;
import upc.edu.pe.llamitafinance.realestates.domain.service.RealEstateService;
import upc.edu.pe.llamitafinance.shared.exception.ResourceNotFoundException;
import upc.edu.pe.llamitafinance.shared.exception.ResourceValidationException;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
public class RealEstateServiceImpl implements RealEstateService {

    private static final String ENTITY = "RealEstate";

    private final RealEstateRepository realEstateRepository;

    private final Validator validator;

    public RealEstateServiceImpl(RealEstateRepository realEstateRepository, Validator validator){
        this.realEstateRepository = realEstateRepository;
        this.validator = validator;
    }

    @Override
    public List<RealEstate> getAll(){
        return realEstateRepository.findAll();
    }

    @Override
    public Page<RealEstate> getAll(Pageable pageable){
        return realEstateRepository.findAll(pageable);
    }

    @Override
    public RealEstate getById(Long id){
        return realEstateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, id));
    }

    @Override
    public RealEstate create(RealEstate realEstate){
        Set<ConstraintViolation<RealEstate>> violations = validator.validate(realEstate);

        if (!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);

        return realEstateRepository.save(realEstate);
    }
}
