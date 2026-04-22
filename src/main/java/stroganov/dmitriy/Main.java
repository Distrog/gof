package stroganov.dmitriy;

import stroganov.dmitriy.behavioral.iterator.*;
import stroganov.dmitriy.behavioral.mediator.Husband;
import stroganov.dmitriy.behavioral.mediator.Layer;
import stroganov.dmitriy.behavioral.mediator.Mediator;
import stroganov.dmitriy.behavioral.mediator.Wife;
import stroganov.dmitriy.behavioral.memento.PhonoAlbum;
import stroganov.dmitriy.behavioral.memento.Turist;
import stroganov.dmitriy.behavioral.observer.Blogger;
import stroganov.dmitriy.behavioral.observer.Subscriber;
import stroganov.dmitriy.behavioral.state.Employee;
import stroganov.dmitriy.behavioral.strategy.*;
import stroganov.dmitriy.behavioral.templateMethod.Grunt;
import stroganov.dmitriy.behavioral.templateMethod.Unit;
import stroganov.dmitriy.behavioral.visitor.*;

import java.time.LocalDate;
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

//        Programmer programmer = new Trainee();
//        programmer.work();

//        Person person = new Person("Дмитрий", "Стfроганов", "Алексеевич");
//
//        Handler first = new NameHandler();
//        Handler second = new SurnameHandler();
//        Handler third = new PatronymicHandler();
//        second.setNext(third);
//        first.setNext(second);
//
//        try {
//            first.handle(person);
//        } catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }

//        RemoteController remoteController = new RemoteController();
//        remoteController.pushButton(CommandName.ON);
//        remoteController.pushButton(CommandName.OFF);
//        remoteController.pushButton(CommandName.NEXT_CHANNEL);
//        remoteController.pushButton(CommandName.NEXT_CHANNEL);
//        remoteController.pushButton(CommandName.PREVIOUS_CHANNEL);

//        try {
//            Shelter catShelter = new CatShelter(List.of(new Cat(), new Cat()));
//            AnimalIterator catShelterIterator = catShelter.createIterator();
//            catShelterIterator.next();
//            catShelterIterator.next();
////            catShelterIterator.next();
//
//            Shelter dogShelter = new DogShelter(List.of(new Dog(), new Dog(), new Dog()));
//            AnimalIterator dogShelterIterator = dogShelter.createIterator();
//            dogShelterIterator.next();
//            dogShelterIterator.next();
//            if(dogShelterIterator.hasNext()){
//                dogShelterIterator.next();
//            }
//            if(dogShelterIterator.hasNext()){
//                dogShelterIterator.next();
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

//        Mediator layer = new Layer();
//        Wife wife = new Wife(layer);
//        Husband husband = new Husband(layer);
//
//        husband.send("12345447745");
//        wife.send("asdfg;sdgfhn");

//        Turist turist = new Turist("горы", LocalDate.of(2026, 04, 10));
//        PhonoAlbum photoAlbum = new PhonoAlbum();
//        photoAlbum.getPhotos().push(turist.takePhoto());
//        turist.setPlace("река");
//        turist.setDate(LocalDate.of(2026, 04, 11));
//        photoAlbum.getPhotos().push(turist.takePhoto());
//        System.out.println(photoAlbum);
//        photoAlbum.getPhotos().pop();
//        System.out.println(turist);
//        turist.returnToLastLocation(photoAlbum.getPhotos().peek());
//        System.out.println(turist);

//        Subscriber subscriber1 = new Subscriber();
//        Subscriber subscriber2 = new Subscriber();
//
//        Blogger blogger = new Blogger();
//        blogger.subscribe(subscriber1);
//        blogger.subscribe(subscriber2);
//
//        blogger.notifySubscribers();

//        Employee employee = new Employee();
//
//        employee.request();
//        employee.request();
//        employee.request();
//        employee.request();

//        AllTerrainVehicle car = new AllTerrainVehicle(new Drive());
//        AllTerrainVehicle airplane = new AllTerrainVehicle(new Fly());
//        AllTerrainVehicle boat = new AllTerrainVehicle(new Swim());
//
//        car.move();
//        airplane.move();
//        boat.move();

//        Unit grunt = new Grunt();
//        grunt.shout();
//        grunt.attack();
//        grunt.die();

        VisitPlan visitPlan = new VisitPlan();
        visitPlan.add(new Home());
        visitPlan.add(new Work());
        visitPlan.add(new Bar());
        visitPlan.accept(new PlaceVisitorImpl());

    }
}