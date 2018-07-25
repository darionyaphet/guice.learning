package org.darion.yaphet.guice;

public class UserServiceImpl implements UserService {
    @Override
    public void process() {
        System.out.println("User Service is Running");
    }
}
