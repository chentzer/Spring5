package chentzer.specs;

import chentzer.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V8Engine")
public class V8 implements Engine {

    @Override
    public String specs() {
        return "V8 Engine";
    }
}
