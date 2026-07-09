package lesson_9_abstract_interf.cars;

public class Jeep extends Car{
    public Jeep(String model, int maxSpeed, int productionYear) {
        super(model, maxSpeed, productionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("Jeep ENGINE STARTS...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Jeep ENGINE STOPS...");
    }
}
