package com.example.llamita_finance_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class PaymentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Long nominalValue;
    private Number couponRate;
    private Number paymentDeadline;
    private String couponPayment;
    private Number partialGraceDeadline;
    private Number structurationCost;
    private Number placementCost;
    private Number floatingCost;
    private Number cavali;
    private Number deadlineCost;
    private Long customerId;

    public Long getNominalValue() { return nominalValue; }
    public void setNominalValue(Long nominalValue) { this.nominalValue = nominalValue; }
    public Number getCouponRate() { return couponRate; }
    public void setCouponRate(Number couponRate) { this.couponRate = couponRate; }
    public Number getPaymentDeadline() { return paymentDeadline; }
    public void setPaymentDeadline(Number paymentDeadline) { this.paymentDeadline = paymentDeadline; }
    public String getCouponPayment() { return couponPayment; }
    public void setCouponPayment(String couponPayment) { this.couponPayment = couponPayment; }
    public Number getPartialGraceDeadline() { return partialGraceDeadline; }
    public void setPartialGraceDeadline(Number partialGraceDeadline) { this.partialGraceDeadline = partialGraceDeadline; }
    public Number getStructurationCost() { return structurationCost; }
    public void setStructurationCost(Number structurationCost) { this.structurationCost = structurationCost; }
    public Number getPlacementCost() { return placementCost; }
    public void setPlacementCost(Number placementCost) { this.placementCost = placementCost; }
    public Number getFloatingCost() { return floatingCost; }
    public void setFloatingCost(Number floatingCost) { this.floatingCost = floatingCost; }
    public Number getCavali() { return cavali; }
    public void setCavali(Number cavali) { this.cavali = cavali; }
    public Number getDeadlineCost() { return deadlineCost; }
    public void setDeadlineCost(Number deadlineCost) { this.deadlineCost = deadlineCost; }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
