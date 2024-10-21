package ro.cozmanca.repositories;

import ro.cozmanca.models.Invoice;

public interface InvoiceRepository {
    void storeInvoice(Invoice invoice);
}
