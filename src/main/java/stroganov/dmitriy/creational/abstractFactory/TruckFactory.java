package stroganov.dmitriy.creational.abstractFactory;

public class TruckFactory implements CarFactory{
    @Override
    public Car create() {
        return new Truck();
    }
}
