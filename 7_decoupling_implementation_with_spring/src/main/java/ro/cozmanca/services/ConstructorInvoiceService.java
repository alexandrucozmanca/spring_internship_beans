package ro.cozmanca.services;

import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;
import ro.cozmanca.repositories.InvoiceRepository;

@Component
public class ConstructorInvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final InvoiceNotificationProxy invoiceNotificationProxy;

    public ConstructorInvoiceService(InvoiceRepository invoiceRepository, InvoiceNotificationProxy invoiceNotificationProxy) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceNotificationProxy = invoiceNotificationProxy;
    }

    public void issueInvoice(Invoice invoice) {
        invoiceRepository.storeInvoice(invoice);
        invoiceNotificationProxy.sendInvoice(invoice);
    }
}
