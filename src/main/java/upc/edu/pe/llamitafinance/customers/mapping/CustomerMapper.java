package upc.edu.pe.llamitafinance.customers.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import upc.edu.pe.llamitafinance.customers.domain.model.entity.Customer;
import upc.edu.pe.llamitafinance.customers.resource.UpdateCustomerResource;
import upc.edu.pe.llamitafinance.shared.mapping.EnhancedModelMapper;
import upc.edu.pe.llamitafinance.customers.resource.CreationCustomerResource;
import upc.edu.pe.llamitafinance.customers.resource.CustomerResource;

import java.io.Serializable;
import java.util.List;

public class CustomerMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper;

    public CustomerResource toResource(Customer model){
        return mapper.map(model, CustomerResource.class);
    }

    public Page<CustomerResource> modelListPage(List<Customer> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, CustomerResource.class), pageable, modelList.size());
    }

    public Customer toModel(CreationCustomerResource resource){
        return mapper.map(resource, Customer.class);
    }

    public Customer toModel(UpdateCustomerResource resource){
        return mapper.map(resource, Customer.class);
    }
}
