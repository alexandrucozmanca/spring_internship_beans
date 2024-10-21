package ro.cozmanca.repositories.beans;

import ro.cozmanca.models.Invoice;

public class BeanInvoiceRepository {
    public void storeInvoice(Invoice invoice) {
        System.out.println("Invoice stored");
    }
}
