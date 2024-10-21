package ro.cozmanca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;
import ro.cozmanca.repositories.InvoiceRepository;

@Component
public class AutowiredInvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private InvoiceNotificationProxy invoiceNotificationProxy;

    public void issueInvoice(Invoice invoice) {
        invoiceRepository.storeInvoice(invoice);
        invoiceNotificationProxy.sendInvoice(invoice);
    }
}
