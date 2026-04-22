package stroganov.dmitriy.behavioral.state;

public class StateMachine {

    public static State initialState(){
        return new Sleep();
    }
}
