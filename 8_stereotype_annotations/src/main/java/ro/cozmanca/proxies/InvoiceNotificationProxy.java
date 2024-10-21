package ro.cozmanca.proxies;

import ro.cozmanca.models.Invoice;

public interface InvoiceNotificationProxy {
    void sendInvoice(Invoice invoice);
}
