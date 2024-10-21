package ro.cozmanca.processors;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.repositories.InvoiceRepository;

import java.util.Random;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class InvoiceProcessor {

    private final InvoiceRepository invoiceRepository;
    private final int delayValue;

    public InvoiceProcessor(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
        Random delay = new Random();
        delayValue = delay.nextInt(10);
        System.out.println("Delay is " + delayValue);
    }

    public void process(Invoice invoice) {
        System.out.println("Processing invoice " + invoice.getNumber());

        int start = 0;
        while (start < delayValue) {
            System.out.println("Delayed at " + start);
            start++;
        }

        invoiceRepository.saveInvoice(invoice);
    }
}
