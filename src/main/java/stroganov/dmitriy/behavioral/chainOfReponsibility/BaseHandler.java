package stroganov.dmitriy.behavioral.chainOfReponsibility;

public abstract class BaseHandler implements Handler{

    protected Handler nextHandler;

    public BaseHandler() {
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void setNext(Handler handler) {
        nextHandler = handler;
    }
}
