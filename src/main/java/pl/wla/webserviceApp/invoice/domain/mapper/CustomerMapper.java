package pl.wla.webserviceApp.invoice.domain.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.wla.webserviceApp.invoice.domain.Customer;
import pl.wla.webserviceApp.invoice.jpa.CustomerEntity;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    @Mapping(source = "id",target = "id")
    @Mapping(source = "name",target = "name")
    CustomerEntity domainToEntity(Customer customer);
    @Mapping(source = "id",target = "id")
    @Mapping(source = "name",target = "name")
    Customer domainToEntity(CustomerEntity customer);
}
