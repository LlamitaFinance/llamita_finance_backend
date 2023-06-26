package upc.edu.pe.llamitafinance.payments.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResource {
    private Long id;
    private Long credit;
    private Number interestRate;
    private Integer nPeriods;
    private Integer gracePeriod;
    private String couponPayment;
    private Long customerId;
}
