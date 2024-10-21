package ro.cozmanca.repositories;

import org.springframework.stereotype.Repository;
import ro.cozmanca.models.Invoice;

@Repository
public class InvoiceRepository {
    public void saveInvoice(Invoice invoice) {
        System.out.println("Invoice saved to database");
    }
}
