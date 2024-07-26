package car;

import interfaces.Car;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {
    @Override
    public void specs() {
        System.out.println("Sedan from Toyota");
    }
}
