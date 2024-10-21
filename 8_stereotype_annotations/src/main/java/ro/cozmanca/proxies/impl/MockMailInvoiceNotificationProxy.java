package ro.cozmanca.proxies.impl;


import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;

@Component
public class MockMailInvoiceNotificationProxy implements InvoiceNotificationProxy {
    @Override
    public void sendInvoice(Invoice invoice) {
        System.out.println("Invoice sent");
    }
}
