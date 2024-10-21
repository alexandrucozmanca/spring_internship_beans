package ro.cozmanca.services.beans;

import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.beans.BeanInvoiceNotificationProxy;
import ro.cozmanca.repositories.beans.BeanInvoiceRepository;

public class BeanInvoiceService {
    private BeanInvoiceRepository repository;
    private BeanInvoiceNotificationProxy notificationProxy;

    public BeanInvoiceService(BeanInvoiceRepository repository, BeanInvoiceNotificationProxy notificationProxy) {
        this.repository = repository;
        this.notificationProxy = notificationProxy;
    }

    public void issueInvoice(Invoice invoice) {
        repository.storeInvoice(invoice);
        notificationProxy.sendInvoice(invoice);
    }
}
