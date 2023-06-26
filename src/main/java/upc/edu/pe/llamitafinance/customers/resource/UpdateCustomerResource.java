package upc.edu.pe.llamitafinance.customers.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
public class UpdateCustomerResource {

    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String firstName;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String lastName;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Integer docNumber;

    @NotNull
    @NotBlank
    @Size(max = 200)
    private String address;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Long realEstateId;
}
