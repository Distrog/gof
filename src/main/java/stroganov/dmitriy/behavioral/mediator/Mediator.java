package stroganov.dmitriy.behavioral.mediator;

public interface Mediator {
    void sendToHusband(String message, Wife wife);
    void sendToWife(String message, Husband husband);
}
