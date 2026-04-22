package stroganov.dmitriy.creational.abstractFactory;

public class PassangerCarFactory implements CarFactory{
    @Override
    public Car create() {
        return new PassangerCar();
    }
}
