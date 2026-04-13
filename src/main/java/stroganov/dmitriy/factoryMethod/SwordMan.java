package stroganov.dmitriy.factoryMethod;

public class SwordMan extends Unit{

    public SwordMan(){
        weapon = new Sword();
        armor = new IronArmor();
        race = new Human();
    }
}
