package stroganov.dmitriy.behavioral.mediator;

public class Wife {

    private Mediator mediator;

    public Wife(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.sendToHusband(message, this);
    }


}
