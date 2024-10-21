package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.config.ProjectConfig;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.services.InvoiceService;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(InvoiceService.class);
        Invoice invoice = new Invoice("Invoice1", 30);

        service.issueInvoice(invoice);
        service.editInvoice(invoice);
        service.deleteInvoice(invoice);
    }
}
