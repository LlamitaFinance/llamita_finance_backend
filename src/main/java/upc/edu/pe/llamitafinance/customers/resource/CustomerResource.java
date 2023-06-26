package upc.edu.pe.llamitafinance.customers.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResource {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer docNumber;
    private String address;
    private Long realEstateId;
}
