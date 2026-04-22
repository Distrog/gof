package stroganov.dmitriy.behavioral.mediator;

public class Husband {

    private Mediator mediator;

    public Husband(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.sendToWife(message, this);
    }
}
