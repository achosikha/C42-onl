package lesson_17_lambas;

// WildCard - extends
// WildCard - super
// WildCard - ?
public class MyMain {
    public static void main(String[] args){
        PersonContainer<Person> staffMember = new PersonContainer<>(new Accountant("Vova", "Ivanov"));

        Object obj = "String";

        System.out.println(obj instanceof String);

        /*
        if (obj instanceof String s && s.length() > 5) {
        System.out.println(s.toUpperCase());
        }
         */
    }
}
