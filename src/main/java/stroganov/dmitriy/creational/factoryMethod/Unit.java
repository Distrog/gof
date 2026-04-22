package stroganov.dmitriy.creational.factoryMethod;

public abstract class Unit {
    protected Weapon weapon;
    protected Armor armor;
    protected Race race;

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Race getRace() {
        return race;
    }
}
