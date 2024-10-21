package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.models.Invoice;

import java.util.logging.Logger;

@Service
public class InvoiceQuantityService {

    Logger logger = Logger.getLogger(InvoiceQuantityService.class.getName());

    public Integer issueInvoice(Invoice invoice) {
        logger.info("Invoice issued with quantity: " + invoice.getQuantity());
        return invoice.getQuantity();
    }
}
