package pl.wla.webserviceApp.invoice.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wla.webserviceApp.invoice.domain.Invoice;
import pl.wla.webserviceApp.invoice.domain.VatRate;
import pl.wla.webserviceApp.invoice.domain.service.VatRateService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    VatRateService vatRateService;

    @GetMapping("/getVatRates")
    public List<VatRate> getVat(){
        return vatRateService.getVatRates();
    }

    @GetMapping("/getData")
    public ArrayList<Invoice> getData(@RequestParam(value="custno") int custNo){
        return null;
    }


}