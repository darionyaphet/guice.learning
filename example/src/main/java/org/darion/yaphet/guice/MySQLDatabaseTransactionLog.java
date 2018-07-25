package org.darion.yaphet.guice;

public class MySQLDatabaseTransactionLog extends DatabaseTransactionLog {
    @Override
    public void logging() {
        System.out.println("MySQL Database Transaction Logging");
    }
}
