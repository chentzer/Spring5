package chentzer.specs;

import chentzer.interfaces.Engine;

public class EngineType implements Engine {

    String type;

    public EngineType() {
        type="Unknown";
    }

    public EngineType(String type) {
        this.type = type;
    }

    @Override
    public String specs() {
        return type;
    }
}
