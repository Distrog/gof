package stroganov.dmitriy.behavioral.visitor;

public class Bar implements Place {
    @Override
    public void accept(PlaceVisitor placeVisitor) {
        placeVisitor.visitBar(this);
    }
}
