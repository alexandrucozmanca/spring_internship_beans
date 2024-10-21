package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.annotations.ToLog;
import ro.cozmanca.models.Invoice;

@Service
public class InvoiceService {

    public InvoiceService() {
    }


    public void issueInvoice(Invoice invoice) {
        System.out.println("Invoice issued");
    }

    public Invoice editInvoice(Invoice invoice) {
        System.out.println("Invoice edit" + invoice);
        return invoice;
    }

    @ToLog
    public String deleteInvoice(Invoice invoice) {
        System.out.println("Invoice deleted" + invoice);
        return "DELETED";
    }
}
