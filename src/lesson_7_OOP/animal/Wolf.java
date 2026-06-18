package lesson_7_OOP.animal;

public class Wolf extends Animal{
    public Wolf(String animalType, String animalName, String animalColor, int age, double weight) {
        super(animalType, animalName, animalColor, age, weight);
    }

    @Override
    public void roars() {
        System.out.println("Wolf does not ROAR! Он ВОЕТ! Особенно НОЧЬЮ!");
    }

    @Override
    public void run() {
        System.out.println("Волк бегает быстрее ЛЬВА!");
    }
}
