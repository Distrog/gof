package stroganov.dmitriy.behavioral.chainOfReponsibility;

public interface Handler {

    void setNext(Handler handler);
    void handle(Person person);
}
