package upc.edu.pe.llamitafinance.payments.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResource {
    private Long id;
    private String textQuery;
    private Integer initialSamples;
    private Long authorId;
}
