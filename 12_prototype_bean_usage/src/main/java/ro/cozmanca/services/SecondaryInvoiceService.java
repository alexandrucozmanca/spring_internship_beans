package ro.cozmanca.services;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ro.cozmanca.models.Invoice;
import ro.cozmanca.processors.InvoiceProcessor;
import ro.cozmanca.repositories.InvoiceRepository;

@Service
public class SecondaryInvoiceService {
    private final ApplicationContext context;

    public SecondaryInvoiceService(ApplicationContext context) {
        this.context = context;
    }

    public void addInvoice(Invoice invoice) {
        System.out.println("Adding via secondary service");
        var processor = context.getBean(InvoiceProcessor.class);
        processor.process(invoice);
    }
}
