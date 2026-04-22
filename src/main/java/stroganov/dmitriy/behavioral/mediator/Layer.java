package stroganov.dmitriy.behavioral.mediator;

public class Layer implements Mediator{

    private Wife wife;
    private Husband husband;

    @Override
    public void sendToHusband(String message, Wife wife) {
        System.out.printf("жена отправила мужу следующее сообщение: %s\n", message);
    }

    @Override
    public void sendToWife(String message, Husband husband) {
        System.out.printf("муж отправил жене следующее сообщение: %s\n", message);
    }

}
