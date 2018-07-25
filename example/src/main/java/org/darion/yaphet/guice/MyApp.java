package org.darion.yaphet.guice;

import com.google.inject.Inject;

public class MyApp implements Application {
    private UserService userService;
    private LogService logService;
    private TransactionLog transactionLog;

    @Inject
    public MyApp(UserService user, LogService log, TransactionLog transactionLog) {
        this.userService = user;
        this.logService = log;
        this.transactionLog = transactionLog;
    }

    @Override
    public void work() {
        userService.process();
        logService.log("Application is Running ~");
        transactionLog.logging();
    }
}
