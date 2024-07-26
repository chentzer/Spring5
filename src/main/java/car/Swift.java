package car;

import interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {
    @Autowired(required = false)
    Engine engine;

    @Override
    public void specs() {
        System.out.println("Hatchback from Suzuki with engine as " + engine.type);
    }
}
