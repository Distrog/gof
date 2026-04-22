package stroganov.dmitriy.behavioral.strategy;

public class Drive implements Moveable{
    @Override
    public void move() {
        System.out.println("еду");
    }
}
