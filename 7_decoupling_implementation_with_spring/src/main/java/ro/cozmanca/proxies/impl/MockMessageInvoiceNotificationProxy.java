package ro.cozmanca.proxies.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;

@Qualifier("MockMessageInvoiceNotificationProxy")
@Component
public class MockMessageInvoiceNotificationProxy implements InvoiceNotificationProxy {
    @Override
    public void sendInvoice(Invoice invoice) {
        System.out.println("Invoice sent via MockMessageInvoiceNotificationProxy");
    }
}
