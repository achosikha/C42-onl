package lesson_9_abstract_interf.cars;

// Абстрактный класс говорит, что Я ПРОСТО НАБРОСОК ОБЩИХ КАЧЕСТВО И ПОВЕДЕНИЙ - НИЧЕГО БОЛЬШЕГО
// Поэтому, я не должен иметь право СОЗДАВАТЬ СЕБЯ САМОГО, на основе меня должны создавать ТОЧНЫЕ РЕАЛИЗАЦИИ
public abstract class Car {
    private final String model;
    private final int maxSpeed;
    private final int productionYear;

    public Car(String model, int maxSpeed, int productionYear) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.productionYear = productionYear;
    }

    // Прототип функции С++
    // Когда вы говорите что, но не КАК
    public abstract void startEngine();
    public abstract void stopEngine();

    @Override
    public String toString() {
        return "\n\tModel: " + this.model +
                "\n\tSpeed: " + this.maxSpeed +
                "\n\tProduction Year: " + this.productionYear;
    }
}
