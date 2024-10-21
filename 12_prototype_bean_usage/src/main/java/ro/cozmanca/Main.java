package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.services.PrimaryInvoiceService;
import ro.cozmanca.services.SecondaryInvoiceService;

public class Main
{
    public static void main( String[] args ) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var primaryInvoiceService = context.getBean(PrimaryInvoiceService.class);
        var secondaryService = context.getBean(SecondaryInvoiceService.class);

        var invoice1 = new Invoice(1, 10);
        var invoice2 = new Invoice(2, 4);
        var invoice3 = new Invoice(4, 20);

        primaryInvoiceService.addInvoice(invoice1);
        secondaryService.addInvoice(invoice2);
        primaryInvoiceService.addInvoice(invoice3);

    }
}
