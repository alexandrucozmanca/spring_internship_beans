package ro.cozmanca.services;

import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;
import ro.cozmanca.repositories.InvoiceRepository;

public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final InvoiceNotificationProxy invoiceNotificationProxy;

    public InvoiceService(InvoiceRepository invoiceRepository, InvoiceNotificationProxy invoiceNotificationProxy) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceNotificationProxy = invoiceNotificationProxy;
    }

    public void issueInvoice(Invoice invoice) {
        invoiceRepository.storeInvoice(invoice);
        invoiceNotificationProxy.sendInvoice(invoice);
    }
}
