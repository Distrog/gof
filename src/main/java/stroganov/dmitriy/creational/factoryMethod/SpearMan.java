package stroganov.dmitriy.creational.factoryMethod;

public class SpearMan extends Unit{

    public SpearMan(){
        weapon = new Spear();
        armor = new LeatherArmor();
        race = new Human();
    }
}
