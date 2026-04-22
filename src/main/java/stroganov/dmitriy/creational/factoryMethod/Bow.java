package stroganov.dmitriy.creational.factoryMethod;

public class Bow extends Weapon{
    @Override
    public void strike() {
        System.out.println("выстрел из лука");
    }
}
