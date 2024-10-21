package ro.cozmanca.repositories.impl;

import ro.cozmanca.models.Invoice;
import ro.cozmanca.repositories.InvoiceRepository;

public class MockDBInvoiceRepository implements InvoiceRepository {
    @Override
    public void storeInvoice(Invoice invoice) {
        System.out.println("Invoice stored");
    }
}
