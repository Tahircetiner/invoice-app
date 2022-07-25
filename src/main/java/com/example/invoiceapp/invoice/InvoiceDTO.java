package com.example.invoiceapp.invoice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceDTO {
    private String streetAddress;
    private String city;
    private String postCode;
    private String country;
}
