package org.darion.yaphet.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
//        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
//        bind(DatabaseTransactionLog.class).to(MySQLDatabaseTransactionLog.class);
        bind(TransactionLog.class).toProvider(DatabaseTransactionLogProvider.class);

        bind(TransactionLog.class).to(InMemoryTransactionLog.class).in(Singleton.class);
    }
}
