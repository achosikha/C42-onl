package lesson_10_obj_more_interfaces.clone;

public class Person implements Cloneable{
    private final String name;
    private final String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public Person (Person temp){}

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "" +
                "\nSurname: " + this.surname +
                "\nAge: " + this.age;
    }
}
