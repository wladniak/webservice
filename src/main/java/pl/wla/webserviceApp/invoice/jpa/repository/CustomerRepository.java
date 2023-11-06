package pl.wla.webserviceApp.invoice.jpa.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import pl.wla.webserviceApp.invoice.jpa.VatRateEntity;

@Repository
public interface CustomerRepository extends ListCrudRepository<VatRateEntity, Long> {

}


