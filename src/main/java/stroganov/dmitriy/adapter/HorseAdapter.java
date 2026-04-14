package stroganov.dmitriy.adapter;

public class HorseAdapter extends Vehicle{
    private Horse horse;

    public HorseAdapter(Horse horse){
        this.horse = horse;
    }

    @Override
    public void drive() {
        System.out.println("Ехать на лошади");
    }
}
