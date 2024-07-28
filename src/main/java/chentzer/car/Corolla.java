package chentzer.car;

import chentzer.interfaces.Car;
import chentzer.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Corolla implements Car {
    @Autowired
    @Qualifier("V6Engine")
    Engine engine;

    @Override
    public void specs() {
        System.out.println("Sedan from Toyota with engine as " + engine.specs());
    }
}
