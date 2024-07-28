package chentzer.specs;

import chentzer.interfaces.Engine;

public class V8 implements Engine {

    @Override
    public String specs() {
        return "V8 Engine";
    }
}
