package stroganov.dmitriy.flyweight;

import java.awt.*;
import java.util.Objects;

public class MinionFactory {

    MinionTypeFactory minionTypeFactory;

    public MinionFactory(MinionTypeFactory minionTypeFactory) {
        this.minionTypeFactory = minionTypeFactory;
    }

    public Minion createMinion(String name, String age, Color color, byte eyesNumber, Clothes clothes) {

        MinionType minionType = minionTypeFactory.getMinionType(color, eyesNumber, clothes);

        return new Minion(name, age, minionType);
    }

}
