package pl.wla.webserviceApp.invoice.domain;

public record InvoicePosition(int posNo, int vat, float quantity, float price, String posDescription){
}