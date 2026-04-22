package stroganov.dmitriy.behavioral.strategy;

public class AllTerrainVehicle {

    private Moveable moveable;

    public AllTerrainVehicle(Moveable moveable) {
        this.moveable = moveable;
    }

    public void move(){
        moveable.move();
    }
}
