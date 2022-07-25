package com.example.invoiceapp.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @PostMapping(value = "/api/createInvoice", consumes = "application/json")
    public void createInvoice(@RequestBody InvoiceDTO invoiceDTO){
        if(invoiceDTO != null){
            invoiceService.saveInvoice(invoiceDTO);
        }
    }
}
