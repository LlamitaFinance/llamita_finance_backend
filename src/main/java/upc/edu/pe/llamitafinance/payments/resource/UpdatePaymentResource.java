package upc.edu.pe.llamitafinance.payments.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
public class UpdatePaymentResource {

    private Long id;

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
