package org.darion.yaphet.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class RealBillingService implements BillingService {

    @Inject
    public RealBillingService(@PayPal CreditCardProcessor processor,
                              TransactionLog transactionLog) {

    }
}
