package pl.wla.webserviceApp.invoice.jpa;

import jakarta.persistence.*;
@Entity
@Table(name="CUSTOMER")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CUST_ID")
    private int id;
    @Column(name = "CUST_NAME", length=100, nullable = false)
    private String name;

}
