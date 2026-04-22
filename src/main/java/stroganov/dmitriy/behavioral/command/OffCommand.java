package stroganov.dmitriy.behavioral.command;

public class OffCommand extends TVCommand{
    public OffCommand(TV tv) {
        super(tv);
    }

    @Override
    public void execute() {
        tv.off();
    }
}
