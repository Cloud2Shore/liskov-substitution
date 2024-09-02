package lsp.model;

import org.springframework.stereotype.Component;

@Component
public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

