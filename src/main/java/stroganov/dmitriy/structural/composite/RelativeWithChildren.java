package stroganov.dmitriy.structural.composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelativeWithChildren extends Relative {

    private List<Relative> children = new ArrayList<>();

    public RelativeWithChildren(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public void add(Relative relative) {
        children.add(relative);
    }

    public void add(Relative... relatives) {
        children.addAll(Arrays.asList(relatives));
    }

    public void remove(Relative relative) {
        children.remove(relative);
    }

    public void remove(Relative... relatives) {
        children.removeAll(Arrays.asList(relatives));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public String info() {
        StringBuilder result = new StringBuilder();
        result.append(super.info());
        children.forEach(c -> {
            result.append(c.info());
        });
        return result.toString();
    }
}
