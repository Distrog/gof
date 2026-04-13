package stroganov.dmitriy.factoryMethod;

public class DwarfWarrior extends Unit{

    public DwarfWarrior(){
        weapon = new Axe();
        armor = new IronArmor();
        race = new Dwarf();
    }
}
