package stroganov.dmitriy.factoryMethod;

public class ElfArcher extends Unit{

    public ElfArcher(){
        weapon = new Bow();
        armor = new LeatherArmor();
        race = new Elf();
    }
}
