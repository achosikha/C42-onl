package lesson_7_OOP.animal;

public class Lion extends Animal{
    private String hiddenData = "HIDDEN LION";

    public Lion(String animalType, String animalName, String animalColor, int age, double weight) {
        super(animalType, animalName, animalColor, age, weight);
    }

    @Override
    public void roars() {
        System.out.println("Да, ЛЬВЫ РЕВЯТ!");
        System.out.println("А это СКРЫТЫЕ ДАННЫЕ: " + this.hiddenData);
    }

    @Override
    public void run() {
        System.out.println("Львы бегать могут, но это точно не их сильная сторона!");
    }
}
