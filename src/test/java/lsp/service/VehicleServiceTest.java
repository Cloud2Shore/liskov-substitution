package lsp.service;

import lsp.model.Car;
import lsp.model.Truck;
import lsp.model.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class VehicleServiceTest {

    private VehicleService vehicleService;
    private Vehicle car;
    private Vehicle truck;

    @BeforeEach
    void setUp() {
        car = Mockito.mock(Car.class);
        truck = Mockito.mock(Truck.class);

        vehicleService = new VehicleService(List.of(car, truck));
    }

    @Test
    void shouldStartAllEngines() {
        vehicleService.startAllEngines();

        verify(car, times(1)).startEngine();
        verify(truck, times(1)).startEngine();
    }
}
