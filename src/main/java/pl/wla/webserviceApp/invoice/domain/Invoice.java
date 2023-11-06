package pl.wla.webserviceApp.invoice.domain;

import pl.wla.webserviceApp.invoice.jpa.InvoicePositionEntity;

import java.util.ArrayList;
import java.util.Date;

public record Invoice(int invno, Date invDate, int custNo, ArrayList<InvoicePositionEntity> positions) {

    }
