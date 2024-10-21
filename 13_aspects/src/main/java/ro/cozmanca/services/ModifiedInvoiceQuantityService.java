package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.models.Invoice;

import java.util.logging.Logger;

@Service
public class ModifiedInvoiceQuantityService {

    Logger logger = Logger.getLogger(ModifiedInvoiceQuantityService.class.getName());

    public Invoice modifiedIssueInvoice(Invoice invoice) {
        logger.info("Invoice issued with quantity: " + invoice.getQuantity());
        return invoice;
    }
}
