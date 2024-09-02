package lsp.model;

import org.springframework.stereotype.Component;

@Component
public class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }
}

