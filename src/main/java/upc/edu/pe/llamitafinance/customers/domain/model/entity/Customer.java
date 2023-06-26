package upc.edu.pe.llamitafinance.customers.domain.model.entity;

import lombok.*;
import upc.edu.pe.llamitafinance.shared.domain.model.AuditModel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
