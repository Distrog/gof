package stroganov.dmitriy.behavioral.command;

public class OnCommand extends TVCommand{

    public OnCommand(TV tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.on();
    }
}
