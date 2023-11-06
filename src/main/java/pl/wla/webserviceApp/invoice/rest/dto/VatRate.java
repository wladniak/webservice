package pl.wla.webserviceApp.invoice.rest.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="VAT_RATE")
public class VatRate {
    @Id
    @Column(name="VAT_CODE", length = 10)
    private String code;
    @Column(name="VAT_RATE")
    private int rate;

}
