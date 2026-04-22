package stroganov.dmitriy.behavioral.templateMethod;

public abstract class Unit {

    public abstract void shout();

    public abstract void attack();

    public void die(){
        System.out.println("Предсмертный хрип");
    }
}
