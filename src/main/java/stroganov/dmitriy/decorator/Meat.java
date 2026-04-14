package stroganov.dmitriy.decorator;

public class Meat extends Ingredient{
    public Meat(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String toString() {
        return pizza.toString() + " с мясом";
    }
}
