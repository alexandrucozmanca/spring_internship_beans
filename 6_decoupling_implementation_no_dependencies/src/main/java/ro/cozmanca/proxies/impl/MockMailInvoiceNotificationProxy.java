package ro.cozmanca.proxies.impl;

import ro.cozmanca.models.Invoice;
import ro.cozmanca.proxies.InvoiceNotificationProxy;

public class MockMailInvoiceNotificationProxy implements InvoiceNotificationProxy {
    @Override
    public void sendInvoice(Invoice invoice) {
        System.out.println("Invoice sent");
    }
}
