package com.example.invoiceapp.invoice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    private String streetAddress;
    private String city;
    private String postCode;
    private String country;

}
