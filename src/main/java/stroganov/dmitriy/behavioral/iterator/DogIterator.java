package stroganov.dmitriy.behavioral.iterator;

public class DogIterator implements AnimalIterator {

    private Shelter shelter;
    private int counter = 0;

    public DogIterator(DogShelter shelter) {
        this.shelter = shelter;
    }

    @Override
    public boolean hasNext() {
        if (shelter.count() > counter) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void next() {
        shelter.get(counter++);
    }
}
