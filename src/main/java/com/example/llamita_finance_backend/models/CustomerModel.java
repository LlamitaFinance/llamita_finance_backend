package com.example.llamita_finance_backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private Number docNumber;
    private String address;
    private Number phoneNumber;
    private Long userId;

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Number getDocNumber() { return docNumber; }

    public void setDocNumber(Number docNumber) { this.docNumber = docNumber; }
    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }
    public Number getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(Number phoneNumber) { this.phoneNumber = phoneNumber; }

    public Long getId() {
        return id;
    }

    public void setId(Long Userid) {
        this.userId = userId;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
