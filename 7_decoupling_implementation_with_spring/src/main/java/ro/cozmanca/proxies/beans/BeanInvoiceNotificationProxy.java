package ro.cozmanca.proxies.beans;

import ro.cozmanca.models.Invoice;

public class BeanInvoiceNotificationProxy {
    public void sendInvoice(Invoice invoice) {
        System.out.println("Invoice sent");
    }
}
