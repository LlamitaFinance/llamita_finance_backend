package upc.edu.pe.llamitafinance.realestates.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
public class UpdateRealEstateResource {

    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String email;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String password;
}
