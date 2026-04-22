package stroganov.dmitriy.creational.factoryMethod;

public class DwarfWarriorBarraks extends Barraks{
    @Override
    public Unit create() {
        return new DwarfWarrior();
    }
}
