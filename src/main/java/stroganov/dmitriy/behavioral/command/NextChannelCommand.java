package stroganov.dmitriy.behavioral.command;

public class NextChannelCommand extends TVCommand {

    public NextChannelCommand(TV tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }
}
