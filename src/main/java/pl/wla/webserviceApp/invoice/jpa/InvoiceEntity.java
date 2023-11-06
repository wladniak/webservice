package pl.wla.webserviceApp.invoice.jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
@Entity
@Table(name ="INVOICE")
public class InvoiceEntity {
    @Id
    @Column(name = "INV_NO")
    private int invno;
    @Column(name = "INV_DATE")
    @Temporal(TemporalType.DATE)
    private Date invDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INV_CUST_ID", referencedColumnName = "CUST_ID")
    private CustomerEntity customer;
    @OneToMany
    @JoinColumn(name = "POS_INV_NO")
    private ArrayList<InvoicePositionEntity> positions;

}
