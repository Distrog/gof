package stroganov.dmitriy.behavioral.visitor;

public interface Place {

    void accept(PlaceVisitor placeVisitor);
}
