package upc.edu.pe.llamitafinance.payments.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreationPaymentResource {

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Long credit;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Number interestRate;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Integer nPeriods;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Integer gracePeriod;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String couponPayment;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private Long customerId;
}
