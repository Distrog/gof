package stroganov.dmitriy;

import stroganov.dmitriy.builder.Warrior;
import stroganov.dmitriy.factoryMethod.Barraks;
import stroganov.dmitriy.factoryMethod.ElfArcherBarraks;
import stroganov.dmitriy.factoryMethod.Unit;
import stroganov.dmitriy.prototype.Client;
import stroganov.dmitriy.prototype.Purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Barraks elfBarraks = new ElfArcherBarraks();
//        Unit legolas = elfBarraks.create();
//        legolas.getWeapon().strike();
//        legolas.getArmor().defend();
//        legolas.getRace().say();

//        Warrior warrior = Warrior.builder().name("Sam").damage(10).build();
//        System.out.println(warrior.toString());
        Client firstClient = new Client("Dmitiry", "1234567", List.of(new Purchase("Покупка1",BigDecimal.valueOf(100)), new Purchase("Покупка2",BigDecimal.valueOf(200))));
        Client secondClient = firstClient.createAndCopy(firstClient);
        System.out.println(firstClient);
        System.out.println(secondClient);
    }
}