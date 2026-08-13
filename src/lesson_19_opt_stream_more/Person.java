package lesson_19_opt_stream_more;

import java.util.List;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final String position;
    private final List<String> functions;

    public Person(String name, String surname, int age, String position, List<String> functions){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.functions = functions;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public List<String> getFunctions() {
        return functions;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname +
                ", age: " + this.age +
                ", position: " + this.position +
                ", functions: " + this.functions;
    }
}
