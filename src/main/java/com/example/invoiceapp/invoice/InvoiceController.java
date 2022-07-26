package com.example.invoiceapp.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin
public class InvoiceController {
    /*@Autowired
    InvoiceService invoiceService;

    @PostMapping(value = "/api/createInvoice", consumes = "application/json")
    public void createInvoice(@RequestBody InvoiceDTO invoiceDTO){
        if(invoiceDTO != null){
            invoiceService.saveInvoice(invoiceDTO);
        }
    }*/

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    @ResponseBody
    @CrossOrigin
    public ModelAndView getOverviewPage(HttpServletRequest httpServletRequest){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
