package stroganov.dmitriy.behavioral.state;

public class Work extends State{
    @Override
    public void handle(Employee employee) {
        System.out.println("Работаю");
    }
}
