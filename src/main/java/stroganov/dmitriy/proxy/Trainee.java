package stroganov.dmitriy.proxy;

public class Trainee extends Programmer{

    private Junior junior;

    public Trainee() {
        this.junior = new Junior();
    }

    @Override
    public void work() {
        junior.work();
        System.out.println("Написал код");
    }
}
