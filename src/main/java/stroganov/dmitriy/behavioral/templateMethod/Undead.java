package stroganov.dmitriy.behavioral.templateMethod;

public abstract class Undead extends Unit{

    @Override
    public void die() {
        System.out.println("Я не умираю");
    }

    @Override
    public void shout() {
        System.out.println("За Азерот!");
    }
}
