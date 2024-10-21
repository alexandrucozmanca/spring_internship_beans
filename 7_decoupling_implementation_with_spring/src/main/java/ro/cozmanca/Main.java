package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.services.AutowiredInvoiceService;
import ro.cozmanca.services.ConstructorInvoiceService;
import ro.cozmanca.services.SpecificImplementationInvoiceService;
import ro.cozmanca.services.beans.BeanInvoiceService;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var invoice = new Invoice("Spring_Issuer", 4);

        System.out.println("Issuing Invoice with Constructor Method");
        var constructorInvoiceService = context.getBean(ConstructorInvoiceService.class);
        constructorInvoiceService.issueInvoice(invoice);

        System.out.println("Issuing Invoice with Autowired Method");
        var autowiredInvoiceService = context.getBean(AutowiredInvoiceService.class);
        autowiredInvoiceService.issueInvoice(invoice);

        System.out.println("Issuing Invoice with Beans Service Method");
        var beanInvoiceService = context.getBean(BeanInvoiceService.class);
        beanInvoiceService.issueInvoice(invoice);

        System.out.println("Issuing Invoice with SpecificImplementationInvoiceService Method");
        var specificImplementationInvoiceService = context.getBean(SpecificImplementationInvoiceService.class);
        specificImplementationInvoiceService.issueInvoice(invoice);
    }
}
