package stroganov.dmitriy;

import stroganov.dmitriy.adapter.Horse;
import stroganov.dmitriy.adapter.HorseAdapter;
import stroganov.dmitriy.bridge.*;
import stroganov.dmitriy.builder.Warrior;
import stroganov.dmitriy.composite.Relative;
import stroganov.dmitriy.composite.RelativeWithChildren;
import stroganov.dmitriy.decorator.Cheese;
import stroganov.dmitriy.decorator.Meat;
import stroganov.dmitriy.decorator.Pizza;
import stroganov.dmitriy.decorator.Tomato;
import stroganov.dmitriy.facade.Pizzaria;
import stroganov.dmitriy.factoryMethod.Barraks;
import stroganov.dmitriy.factoryMethod.ElfArcherBarraks;
import stroganov.dmitriy.factoryMethod.Unit;
import stroganov.dmitriy.prototype.Client;
import stroganov.dmitriy.prototype.Purchase;
import stroganov.dmitriy.proxy.Programmer;
import stroganov.dmitriy.proxy.Senior;
import stroganov.dmitriy.proxy.Trainee;
import stroganov.dmitriy.singletone.Hero;

import java.math.BigDecimal;
import java.time.LocalDate;
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

//        Client firstClient = new Client("Dmitiry", "1234567", List.of(new Purchase("Покупка1",BigDecimal.valueOf(100)), new Purchase("Покупка2",BigDecimal.valueOf(200))));
//        Client secondClient = firstClient.createAndCopy(firstClient);
//        System.out.println(firstClient);
//        System.out.println(secondClient);

//        Hero hero = Hero.getInstance();
//        System.out.println(hero);
//        hero = Hero.getInstance();
//        System.out.println(hero);
//
//        Horse horse = new Horse();
//        HorseAdapter horseAdapter = new HorseAdapter(horse);
//        horseAdapter.drive();

//        Human man = new Man(new TShirt());
//        Human woman = new Woman(new Dress());
//
//        man.dress();
//        woman.dress();

//        RelativeWithChildren grandfather = new RelativeWithChildren("Валерий", LocalDate.of(1939,12, 13));
//        RelativeWithChildren mother = new RelativeWithChildren("Татьяна", LocalDate.of(1969,8, 27));
//        RelativeWithChildren uncle = new RelativeWithChildren("Сергей", LocalDate.of(1976,2, 12));
//        Relative sister = new Relative("Алина", LocalDate.of(2009, 9, 20));
//        Relative i = new Relative("Дмитрий", LocalDate.of(1992, 9, 29));
//
//        grandfather.add(mother, uncle);
//        uncle.add(sister);
//        mother.add(i);
//
//        System.out.println(grandfather.info());

//        Pizza commonPizza = new Pizza();
//        Pizza pizzaWithTomato = new Tomato(new Pizza());
//        Pizza allInclusivePizza = new Meat(new Tomato(new Cheese(new Pizza())));
//
//        System.out.println(commonPizza);
//        System.out.println(pizzaWithTomato);
//        System.out.println(allInclusivePizza);

//        Pizzaria pizzaria = new Pizzaria();
//        pizzaria.cook();

        Programmer programmer = new Trainee();
        programmer.work();
    }
}