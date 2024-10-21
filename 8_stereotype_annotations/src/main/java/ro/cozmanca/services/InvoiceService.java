package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;
import ro.cozmanca.repositories.InvoiceRepository;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceNotificationProxy invoiceNotificationProxy;

    public InvoiceService(InvoiceRepository invoiceRepository, InvoiceNotificationProxy invoiceNotificationProxy) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceNotificationProxy = invoiceNotificationProxy;
    }

    public void issueInvoice(Invoice invoice) {
        System.out.println("Issuing invoice with stereotype Service");
        invoiceRepository.save(invoice);
        invoiceNotificationProxy.sendInvoice(invoice);
    }
}
