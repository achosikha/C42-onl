package lesson_9_abstract_interf.cars;

public class OpelVectra extends Opel{
    public OpelVectra(String model, int maxSpeed, int productionYear) {
        super(model, maxSpeed, productionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("Opel Vectra ENGINE STARTS...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Opel Vectra ENGINE STARTS...");
    }
}
