package stroganov.dmitriy.behavioral.visitor;

public class Work implements Place{
    @Override
    public void accept(PlaceVisitor placeVisitor) {
        placeVisitor.visitWork(this);
    }
}
