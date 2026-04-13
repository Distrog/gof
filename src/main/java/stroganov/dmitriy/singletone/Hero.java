package stroganov.dmitriy.singletone;

import java.util.Objects;

public class Hero {

    private Hero() {

    }

    private static Hero hero;

    public synchronized static Hero getInstance() {
        if (Objects.nonNull(hero)) {
            return hero;
        } else {
            hero = new Hero();
            return hero;
        }
    }
}
