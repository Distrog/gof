package stroganov.dmitriy.decorator;

public abstract class Ingredient extends Pizza{

    protected Pizza pizza;

    public Ingredient(Pizza pizza) {
        this.pizza = pizza;
    }
}
