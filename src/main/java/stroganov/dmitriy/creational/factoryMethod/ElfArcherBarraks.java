package stroganov.dmitriy.creational.factoryMethod;

public class ElfArcherBarraks extends Barraks{
    @Override
    public Unit create() {
        return new ElfArcher();
    }
}
