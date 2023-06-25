package upc.edu.pe.llamitafinance.customers.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResource {
    private Long id;
    private String textQuery;
    private Integer initialSamples;
    private Long authorId;
}
