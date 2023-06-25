package upc.edu.pe.llamitafinance.realestates.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("realEstateMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public RealEstateMapper realEstateMapper(){
        return new RealEstateMapper();
    }
}
