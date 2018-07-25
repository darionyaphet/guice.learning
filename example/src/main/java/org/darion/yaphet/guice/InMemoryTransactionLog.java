package org.darion.yaphet.guice;

import com.google.inject.Singleton;

import java.sql.Connection;

@Singleton
public class InMemoryTransactionLog implements TransactionLog {
    @Override
    public void logging() {

    }

    @Override
    public void setConnection(Connection connection) {

    }
}
