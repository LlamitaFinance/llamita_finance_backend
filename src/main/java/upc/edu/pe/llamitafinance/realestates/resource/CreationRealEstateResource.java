package upc.edu.pe.llamitafinance.realestates.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreationRealEstateResource {

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String textQuery;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Integer initialSamples;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Long authorId;
}
