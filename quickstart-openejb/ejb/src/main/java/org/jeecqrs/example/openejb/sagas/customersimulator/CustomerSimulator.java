package org.jeecqrs.example.openejb.sagas.customersimulator;

import java.util.logging.Logger;
import org.jeecqrs.integration.jcommondomain.sagas.AbstractSingleEventSaga;
import org.jeecqrs.example.openejb.application.api.commands.PayInvoiceCommand;
import org.jeecqrs.example.openejb.domain.model.billing.InvoiceIssued;

/**
 * Simulate a customer.
 * Due to the lack of a real application, we simulate a customer that with a probability
 * of 0.5 decides to pay the invoice or not.
 */
public class CustomerSimulator extends AbstractSingleEventSaga<CustomerSimulator, InvoiceIssued> {

    private static final Logger log = Logger.getLogger(CustomerSimulator.class.getSimpleName());

    @Override
    protected void when(InvoiceIssued event) {
        if (eventSourceReplayActive())
            return;
        if (Math.random() < 0.5) {
            log.info("Customer decided to pay the invoice.");
            this.send(new PayInvoiceCommand(event.invoiceId()));
        } else {
                log.info("Customer decided to ignore the invoice.");
        }
    }
    
}
