package ro.cozmanca.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;
import ro.cozmanca.repositories.InvoiceRepository;

@Component
public class SpecificImplementationInvoiceService {
    InvoiceRepository repository;
    InvoiceNotificationProxy notificationProxy;

    public SpecificImplementationInvoiceService(InvoiceRepository repository, @Qualifier("MockMessageInvoiceNotificationProxy") InvoiceNotificationProxy notificationProxy) {
        this.repository = repository;
        this.notificationProxy = notificationProxy;
    }

    public void issueInvoice(Invoice invoice) {
        repository.storeInvoice(invoice);
        notificationProxy.sendInvoice(invoice);
    }
}
