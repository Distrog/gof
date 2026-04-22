package stroganov.dmitriy.creational.factoryMethod;

public class SwordManBarraks extends Barraks{
    @Override
    public Unit create() {
        return new SwordMan();
    }
}
