package stroganov.dmitriy.behavioral.state;

public class Employee {
    private State state;

    public Employee() {
        this.state = StateMachine.initialState();
    }

    public void request(){
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
