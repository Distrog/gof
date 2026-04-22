package stroganov.dmitriy.creational.factoryMethod;

public class SpearManBarraks extends Barraks{
    @Override
    public Unit create() {
        return new SpearMan();
    }
}
