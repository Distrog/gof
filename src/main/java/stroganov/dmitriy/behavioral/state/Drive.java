package stroganov.dmitriy.behavioral.state;

public class Drive extends State{
    @Override
    public void handle(Employee employee) {
        System.out.println("Доехал до работы");
        employee.setState(new Work());
    }
}
