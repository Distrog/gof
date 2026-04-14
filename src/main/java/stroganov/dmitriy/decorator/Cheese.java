package stroganov.dmitriy.decorator;

public class Cheese extends Ingredient{

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String toString() {
        return pizza.toString()+ " с сыром";
    }
}
