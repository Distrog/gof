package stroganov.dmitriy.behavioral.visitor;

public class Home implements Place{
    @Override
    public void accept(PlaceVisitor placeVisitor) {
        placeVisitor.visitHome(this);
    }
}
