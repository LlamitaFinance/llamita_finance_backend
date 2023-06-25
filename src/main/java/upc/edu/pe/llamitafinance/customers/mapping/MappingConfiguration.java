package upc.edu.pe.llamitafinance.customers.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("customerMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public upc.edu.pe.llamitafinance.customers.mapping.CustomerMapper customerMapper(){
        return new upc.edu.pe.llamitafinance.customers.mapping.CustomerMapper();
    }
}
