package stroganov.dmitriy.abstractFactory;

public class PassangerCarFactory implements CarFactory{
    @Override
    public Car create() {
        return new PassangerCar();
    }
}
