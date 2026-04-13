package stroganov.dmitriy.factoryMethod;

public class Elf extends Unit{

    public Elf(){
        weapon = new Bow();
        armor = new LeatherArmor();
    }

    @Override
    void strike() {

    }

    @Override
    void defend() {

    }

    @Override
    void say() {

    }
}
