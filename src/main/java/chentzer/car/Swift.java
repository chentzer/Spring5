package chentzer.car;

import chentzer.interfaces.Car;
import chentzer.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Swift implements Car {
    @Autowired
    @Qualifier("V8Engine")
    Engine engine;

    @Override
    public void specs() {
        System.out.println("Hatchback from Suzuki with engine as " + engine.specs());
    }
}
