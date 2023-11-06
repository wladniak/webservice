package pl.wla.webserviceApp.invoice.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wla.webserviceApp.invoice.domain.VatRate;
import pl.wla.webserviceApp.invoice.domain.mapper.VatRateMapper;
import pl.wla.webserviceApp.invoice.jpa.VatRateEntity;
import pl.wla.webserviceApp.invoice.jpa.repository.VatRateRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VatRateService {

    @Autowired
    private VatRateRepository vatRateRepository;

    @Autowired
    private VatRateMapper vatRateMapper;

public List<VatRate> getVatRates(){
    List<VatRateEntity> vatRate = vatRateRepository.findAll();
    return vatRate.stream().map(vatRateMapper.INSTANCE::entityToDomain).collect(Collectors.toList());
}
}
