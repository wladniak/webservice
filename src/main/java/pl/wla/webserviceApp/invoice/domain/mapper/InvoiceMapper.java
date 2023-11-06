package pl.wla.webserviceApp.invoice.domain.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.wla.webserviceApp.invoice.domain.Invoice;
import pl.wla.webserviceApp.invoice.jpa.InvoiceEntity;

@Mapper
public interface InvoiceMapper {
    InvoiceMapper INSTANCE = Mappers.getMapper(InvoiceMapper.class);
    @Mapping(source = "invno",target = "invno")
    @Mapping(source = "custNo",target = "custNo")
    @Mapping(source = "invDate",target = "invDate")
    InvoiceEntity domainToEntity(Invoice invoice);

    @Mapping(source = "invno",target = "invno")
    @Mapping(source = "custNo",target = "custNo")
    @Mapping(source = "invDate",target = "invDate")
    Invoice domainToEntity(InvoiceEntity invoice);
}
