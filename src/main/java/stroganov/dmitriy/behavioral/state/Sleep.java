package stroganov.dmitriy.behavioral.state;

public class Sleep extends State {
    @Override
    public void handle(Employee employee) {
        System.out.println("Проснулся");
        System.out.println("Готовлюсь к работе");
        employee.setState(new StayHome());
    }
}
