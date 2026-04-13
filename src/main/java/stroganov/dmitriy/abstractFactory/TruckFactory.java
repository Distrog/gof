package stroganov.dmitriy.abstractFactory;

public class TruckFactory implements CarFactory{
    @Override
    public Car create() {
        return new Truck();
    }
}
