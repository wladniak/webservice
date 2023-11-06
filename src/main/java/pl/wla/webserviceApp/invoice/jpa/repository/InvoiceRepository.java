package pl.wla.webserviceApp.invoice.jpa.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import pl.wla.webserviceApp.invoice.jpa.InvoiceEntity;

import java.util.List;

@Repository
public interface InvoiceRepository extends ListCrudRepository<InvoiceEntity, Long> {

}


