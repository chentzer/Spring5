package car;

import interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

    Engine engine;

//    public Corolla(Engine engine) {
//        engine.type="V6";
//        this.engine = engine;
//    }

    @Autowired(required = false)
    public void setEngine(Engine engine) {
        engine.type="V10";
        this.engine = engine;
    }

    @Override
    public void specs() {
        System.out.println("Sedan from Toyota with engine as " + engine.type);
    }
}
