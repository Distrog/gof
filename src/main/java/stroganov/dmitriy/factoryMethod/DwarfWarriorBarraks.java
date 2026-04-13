package stroganov.dmitriy.factoryMethod;

public class DwarfWarriorBarraks extends Barraks{
    @Override
    public Unit create() {
        return new DwarfWarrior();
    }
}
