package lesson_9_abstract_interf.cars;

public class Mercedes extends Car{
    public Mercedes(String model, int maxSpeed, int productionYear) {
        super(model, maxSpeed, productionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes ENGINE STARTS...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Mercedes ENGINE STOPS...");
    }
}
