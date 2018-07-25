package org.darion.yaphet.guice;

import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import java.sql.Connection;

public class DatabaseTransactionLogProvider implements Provider<TransactionLog> {

    private final Connection connection;

    public DatabaseTransactionLogProvider(Connection connection) {
        this.connection = connection;
    }

    @Override
    @Singleton
    @Provides
    public TransactionLog get() {
        DatabaseTransactionLog log = new DatabaseTransactionLog();
        log.setConnection(connection);
        return log;
    }
}
