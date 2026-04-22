package stroganov.dmitriy.behavioral.iterator;

public class CatIterator implements AnimalIterator{

    private Shelter shelter;
    private int counter = 0;

    public CatIterator(CatShelter shelter) {
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
