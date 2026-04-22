package stroganov.dmitriy.behavioral.strategy;

public class Swim implements Moveable{
    @Override
    public void move() {
        System.out.println("плыву");
    }
}
