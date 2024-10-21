package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.services.InvoiceQuantityService;
import ro.cozmanca.services.InvoiceService;
import ro.cozmanca.services.ModifiedInvoiceQuantityService;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(InvoiceService.class);

        var invoice = new Invoice(4, 2);
        service.printInvoice(invoice);

        var quantityService = context.getBean(InvoiceQuantityService.class);
        System.out.println(quantityService.issueInvoice(invoice));

        var modifiedQuantityService = context.getBean(ModifiedInvoiceQuantityService.class);
        System.out.println(modifiedQuantityService.modifiedIssueInvoice(invoice));
    }
}
