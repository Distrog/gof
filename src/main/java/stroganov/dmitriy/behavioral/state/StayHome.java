package stroganov.dmitriy.behavioral.state;

public class StayHome extends State {
    @Override
    public void handle(Employee employee) {
        System.out.println("Поел");
        System.out.println("Поехал на работу");
        employee.setState(new Drive());
    }


}
