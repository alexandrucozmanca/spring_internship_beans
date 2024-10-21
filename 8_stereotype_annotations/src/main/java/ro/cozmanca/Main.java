package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.services.InvoiceService;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var invoiceService = context.getBean(InvoiceService.class);
        Invoice invoice = new Invoice("StereotypeInvoice", 3);
        invoiceService.issueInvoice(invoice);

    }
}
