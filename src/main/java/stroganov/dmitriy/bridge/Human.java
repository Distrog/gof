package stroganov.dmitriy.bridge;

public abstract class Human {
    private Clothes clothes;

    public Human(Clothes clothes){
        this.clothes = clothes;
    }

    public void dress(){
        System.out.println("На мне "+ clothes.toString());
    }
}
