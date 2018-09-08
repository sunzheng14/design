package com.sun.zq.design.factory.abstractfactory;

public class TopFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new TopCar();
    }

    @Override
    public IBus createBus() {
        return new TopBus();
    }
}
