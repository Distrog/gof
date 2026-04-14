package stroganov.dmitriy.flyweight;

import java.awt.*;
import java.util.Objects;

public class MinionType {

    private Color color;
    private byte eyesNumber;
    private Clothes clothes;

    public MinionType(Color color, byte eyesNumber, Clothes clothes) {
        this.color = color;
        this.eyesNumber = eyesNumber;
        this.clothes = clothes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinionType that = (MinionType) o;
        return eyesNumber == that.eyesNumber && Objects.equals(color, that.color) && clothes == that.clothes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, eyesNumber, clothes);
    }
}
