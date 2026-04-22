package stroganov.dmitriy.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CatShelter implements Shelter{
    List<Animal> animals;

    public CatShelter(List<Cat> cats) {
        this.animals = new ArrayList<>(cats);
    }

    @Override
    public AnimalIterator createIterator() {
        return new CatIterator(this);
    }

    @Override
    public int count() {
        return animals.size();
    }

    @Override
    public void get(int index) {
        if (animals.size() > index) {
            System.out.printf("%d кошка издала звук %s\n", index, animals.get(index).say());;
        } else {
            throw new RuntimeException(String.format("В приюте для кошек всего %d кошек\n", animals.size()));
        }
    }
}
