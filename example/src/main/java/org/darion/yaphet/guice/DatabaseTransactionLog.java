package org.darion.yaphet.guice;

import java.sql.Connection;

public class DatabaseTransactionLog implements TransactionLog {
    @Override
    public void logging() {
        System.out.println("Database Transaction Logging");
    }

    @Override
    public void setConnection(Connection connection) {

    }
}
