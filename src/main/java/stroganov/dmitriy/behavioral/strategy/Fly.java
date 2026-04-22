package stroganov.dmitriy.behavioral.strategy;

public class Fly implements Moveable{
    @Override
    public void move() {
        System.out.println("лечу");
    }
}
