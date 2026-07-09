package lesson_9_abstract_interf.cars;

public class OpelAstra extends Opel{
    public OpelAstra(String model, int maxSpeed, int productionYear) {
        super(model, maxSpeed, productionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("Opel Astra ENGINE STARTS...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Opel Astra ENGINE STARTS...");
    }
}
