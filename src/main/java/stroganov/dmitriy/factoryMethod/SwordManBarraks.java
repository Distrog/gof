package stroganov.dmitriy.factoryMethod;

public class SwordManBarraks extends Barraks{
    @Override
    public Unit create() {
        return new SwordMan();
    }
}
