package com.example.invoiceapp.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public void saveInvoice(InvoiceDTO invoiceDTO){
        Invoice invoice = new Invoice();
        invoice.setCity(invoiceDTO.getCity());
        invoiceRepository.save(invoice);
    }
}
