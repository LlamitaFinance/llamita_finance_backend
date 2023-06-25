package upc.edu.pe.llamitafinance.realestates.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class RealEstateResource {
    private Long id;
    private String textQuery;
    private Integer initialSamples;
    private Long authorId;
}
