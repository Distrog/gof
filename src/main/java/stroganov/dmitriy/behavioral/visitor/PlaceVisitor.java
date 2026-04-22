package stroganov.dmitriy.behavioral.visitor;

public interface PlaceVisitor {

    void visitHome(Home home);

    void visitWork(Work work);

    void visitBar(Bar bar);
}
