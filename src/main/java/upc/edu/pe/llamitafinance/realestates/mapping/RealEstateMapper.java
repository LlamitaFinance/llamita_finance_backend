package upc.edu.pe.llamitafinance.realestates.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import upc.edu.pe.llamitafinance.realestates.domain.model.entity.RealEstate;
import upc.edu.pe.llamitafinance.realestates.resource.UpdateRealEstateResource;
import upc.edu.pe.llamitafinance.shared.mapping.EnhancedModelMapper;
import upc.edu.pe.llamitafinance.realestates.resource.CreationRealEstateResource;
import upc.edu.pe.llamitafinance.realestates.resource.RealEstateResource;

import java.io.Serializable;
import java.util.List;

public class RealEstateMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper;

    public RealEstateResource toResource(RealEstate model){
        return mapper.map(model, RealEstateResource.class);
    }

    public Page<RealEstateResource> modelListPage(List<RealEstate> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, RealEstateResource.class), pageable, modelList.size());
    }

    public RealEstate toModel(CreationRealEstateResource resource){
        return mapper.map(resource, RealEstate.class);
    }

    public RealEstate toModel(UpdateRealEstateResource resource){
        return mapper.map(resource, RealEstate.class);
    }
}
