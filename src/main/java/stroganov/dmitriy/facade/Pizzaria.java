package stroganov.dmitriy.facade;

public class Pizzaria {

    public void cook(){
        Procurer procurer = new Procurer();
        procurer.procure();

        DoughSheeter doughSheeter = new DoughSheeter();
        doughSheeter.roll();

        Cutter cutter = new Cutter();
        cutter.cut();

        Baker baker = new Baker();
        baker.bake();

        Delivery delivery = new Delivery();
        delivery.deliver();
    }
}
