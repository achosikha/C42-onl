package lesson_7_OOP.animal;

public class Animal {
    private String animalType;
    private String animalName;
    private String animalColor;
    private int age;
    private double weight;

    public Animal(String animalType, String animalName, String animalColor, int age, double weight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.age = age;
        this.weight = weight;
    }

    public void run(){
        System.out.println("Animal RUNS!");
    }

    public void roars(){
        System.out.println("Animal ROARS!");
    }

    @Override
    public String toString() {
        return "Animal:" +
                "\n\tType: " + this.animalType +
                "\n\tName: " + this.animalName +
                "\n\tColor: " + this.animalColor +
                "\n\tAge: " + this.age +
                "\n\tWeight: " + this.weight + "KG.";
    }
}