package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.models.Invoice;

import java.util.logging.Logger;


@Service
public class InvoiceService {

    public Logger logger = Logger.getLogger(InvoiceService.class.getName());


    public Invoice printInvoice(Invoice invoice) {
        logger.info("Printing invoice " + invoice.toString());
        return invoice;
    }


}
