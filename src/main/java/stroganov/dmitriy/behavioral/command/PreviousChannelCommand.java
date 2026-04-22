package stroganov.dmitriy.behavioral.command;

public class PreviousChannelCommand extends TVCommand{

    public PreviousChannelCommand(TV tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.previousChannel();
    }
}
