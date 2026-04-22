package stroganov.dmitriy.behavioral.visitor;

public class PlaceVisitorImpl implements PlaceVisitor {
    @Override
    public void visitHome(Home home) {
        System.out.println("Дом был посещен");
    }

    @Override
    public void visitWork(Work work) {
        System.out.println("Работа была посещена");
    }

    @Override
    public void visitBar(Bar bar) {
        System.out.println("Бар был посещен");
    }
}
