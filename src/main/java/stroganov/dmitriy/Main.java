package stroganov.dmitriy;

import stroganov.dmitriy.builder.Warrior;
import stroganov.dmitriy.factoryMethod.Barraks;
import stroganov.dmitriy.factoryMethod.ElfArcherBarraks;
import stroganov.dmitriy.factoryMethod.Unit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Barraks elfBarraks = new ElfArcherBarraks();
//        Unit legolas = elfBarraks.create();
//        legolas.getWeapon().strike();
//        legolas.getArmor().defend();
//        legolas.getRace().say();

        Warrior warrior = Warrior.builder().name("Sam").damage(10).build();
        System.out.println(warrior.toString());
    }
}