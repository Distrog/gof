package stroganov.dmitriy.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class MinionTypeFactory {

    Map<Integer, MinionType> minionTypes = new HashMap();

    public MinionType getMinionType(Color color, byte eyesNumber, Clothes clothes) {

        int hash = Objects.hash(color, eyesNumber, clothes);

        MinionType minionType = minionTypes.get(hash);

        if (Objects.isNull(minionType)) {
            minionType = new MinionType(color, eyesNumber, clothes);
            minionTypes.put(hash, minionType);
        }

        return minionType;
    }
}
