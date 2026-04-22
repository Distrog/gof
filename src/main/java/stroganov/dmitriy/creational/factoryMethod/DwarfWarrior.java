package stroganov.dmitriy.creational.factoryMethod;

public class DwarfWarrior extends Unit{

    public DwarfWarrior(){
        weapon = new Axe();
        armor = new IronArmor();
        race = new Dwarf();
    }
}
