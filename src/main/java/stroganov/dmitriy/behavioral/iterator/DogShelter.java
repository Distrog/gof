package stroganov.dmitriy.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class DogShelter implements Shelter {

    List<Animal> animals;

    public DogShelter(List<Dog> dogs) {
        this.animals = new ArrayList<>(dogs);
    }

    @Override
    public AnimalIterator createIterator() {
        return new DogIterator(this);
    }

    @Override
    public int count() {
        return animals.size();
    }

    @Override
    public void get(int index) {
        if (animals.size() > index) {
            System.out.printf("%d собака издала звук %s\n", index, animals.get(index).say());;
        } else {
            throw new RuntimeException(String.format("В приюте для собак всего %d собак\n", animals.size()));
        }
    }
}
