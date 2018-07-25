package org.darion.yaphet.guice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogServiceImpl implements LogService {
    @Override
    public void log(String message) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("LOG [" + format.format(new Date()) + "]: " + message);
    }
}
