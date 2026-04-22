package stroganov.dmitriy.structural.proxy;

public class Junior extends Programmer{

    private Middle middle;

    public Junior() {
        this.middle = new Middle();
    }

    @Override
    public void work() {
        middle.work();
        System.out.println("Поручил стажеру");
    }
}
