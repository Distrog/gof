package stroganov.dmitriy.behavioral.iterator;

public interface Shelter {

    AnimalIterator createIterator();

    int count();

    void get(int index);
}
