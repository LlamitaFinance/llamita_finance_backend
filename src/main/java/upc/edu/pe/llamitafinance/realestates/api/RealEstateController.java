package upc.edu.pe.llamitafinance.realestates.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.llamitafinance.realestates.domain.service.RealEstateService;
import upc.edu.pe.llamitafinance.realestates.mapping.RealEstateMapper;
import upc.edu.pe.llamitafinance.realestates.resource.CreationRealEstateResource;
import upc.edu.pe.llamitafinance.realestates.resource.RealEstateResource;

@Tag(name = "RealEstate", description = "Real Estate account")
@RestController
@RequestMapping(value = "api/v1/real_estates")
public class RealEstateController {

    private final RealEstateService service;
    private final RealEstateMapper mapper;

    public RealEstateController(RealEstateService service, RealEstateMapper mapper){
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping
    public Page<RealEstateResource> getAllRealEstates(Pageable pageable){
        return mapper.modelListPage(service.getAll(), pageable);
    }

    @GetMapping("{realEstateId}")
    public RealEstateResource getRealEstateById(@PathVariable("realEstateId") Long realEstateId){
        return mapper.toResource(service.getById(realEstateId));
    }

    @PostMapping
    public ResponseEntity<RealEstateResource> createRealEstate(CreationRealEstateResource resource){
        return new ResponseEntity<>(mapper.toResource(service.create(
                mapper.toModel(resource))), HttpStatus.CREATED);
    }
}
