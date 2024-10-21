package ro.cozmanca;

import ro.cozmanca.models.Invoice;
import ro.cozmanca.repositories.impl.MockDBInvoiceRepository;
import ro.cozmanca.proxies.impl.MockMailInvoiceNotificationProxy;
import ro.cozmanca.services.InvoiceService;

public class Main
{
    public static void main( String[] args ) {
        var invoiceRepository = new MockDBInvoiceRepository();
        var invoiceNotificationProxy = new MockMailInvoiceNotificationProxy();

        var invoiceService = new InvoiceService(invoiceRepository, invoiceNotificationProxy);

        var invoice = new Invoice("IssuingCompany", 2);

        invoiceService.issueInvoice(invoice);
    }
}
