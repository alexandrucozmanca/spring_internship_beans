package ro.cozmanca.repositories.impl;

import org.springframework.stereotype.Repository;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.repositories.InvoiceRepository;

@Repository
public class MockDbInvoiceRepository implements InvoiceRepository {
    @Override
    public void save(Invoice invoice) {
        System.out.println("Invoice saved with stereotype Repo");
    }
}
