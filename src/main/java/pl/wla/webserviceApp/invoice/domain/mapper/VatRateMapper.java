package pl.wla.webserviceApp.invoice.domain.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.wla.webserviceApp.invoice.domain.VatRate;
import pl.wla.webserviceApp.invoice.jpa.VatRateEntity;


@Mapper(componentModel = "spring")
public interface VatRateMapper {
    VatRateMapper INSTANCE = Mappers.getMapper(VatRateMapper.class);

    @Mapping(source = "vatRate",target = "rate")
    VatRateEntity domainToEntity(VatRate vatRate);

    @Mapping(source = "rate",target = "vatRate")
    VatRate entityToDomain(VatRateEntity vatRate);
}
