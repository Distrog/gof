package stroganov.dmitriy.creational.prototype;

import java.math.BigDecimal;

public class Purchase {
    private String name;
    private BigDecimal cost;

    public Purchase(String name, BigDecimal cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
