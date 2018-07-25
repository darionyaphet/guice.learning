package org.darion.yaphet.guice;

import java.sql.Connection;

public interface TransactionLog {
    public void logging();

    public void setConnection(Connection connection);
}
