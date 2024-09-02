package lsp.service;

import lsp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final List<Vehicle> vehicles;

    @Autowired
    public VehicleService(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void startAllEngines() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}

