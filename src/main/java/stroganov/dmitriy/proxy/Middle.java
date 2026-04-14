package stroganov.dmitriy.proxy;

public class Middle extends Programmer{

    private Senior senior;

    public Middle() {
        this.senior = new Senior();
    }

    @Override
    public void work() {
        senior.work();
        System.out.println("Поручил джуниору");
    }
}
