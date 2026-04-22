package stroganov.dmitriy.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitPlan {

    List<Place> places;

    public VisitPlan() {
        this.places = new ArrayList<>();
    }

    public void add(Place place) {
        places.add(place);
    }

    public void remove(Place place) {
        places.remove(place);
    }

    public void accept(PlaceVisitor placeVisitor) {
        places.forEach(p -> p.accept(placeVisitor));
    }
}
