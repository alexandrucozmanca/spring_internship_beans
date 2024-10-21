package ro.cozmanca.repositories.impl;

import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.repositories.InvoiceRepository;

@Component
public class MockDBInvoiceRepository implements InvoiceRepository {
    @Override
    public void storeInvoice(Invoice invoice) {
        System.out.println("Invoice stored");
    }
}
