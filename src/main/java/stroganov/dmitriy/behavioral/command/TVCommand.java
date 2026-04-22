package stroganov.dmitriy.behavioral.command;

public abstract class TVCommand implements Command{
    protected TV tv;

    public TVCommand(TV tv) {
        this.tv = tv;
    }
}
