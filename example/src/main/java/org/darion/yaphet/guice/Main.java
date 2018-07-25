package org.darion.yaphet.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * https://blog.csdn.net/u011054333/article/details/57179999
 */
public class Main {
    private static Injector injector;

    public static void main(String[] args) {
        injector = Guice.createInjector(new MyAppModule());
        Application application = injector.getInstance(Application.class);
        application.work();
    }
}
