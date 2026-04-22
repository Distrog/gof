package stroganov.dmitriy.structural.decorator;

public class Tomato extends Ingredient {
    public Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String toString() {
        return pizza.toString() + " c помидорами";
    }
}
