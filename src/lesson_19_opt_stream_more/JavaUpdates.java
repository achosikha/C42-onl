package lesson_19_opt_stream_more;

import java.util.Arrays;
import java.util.List;

public class JavaUpdates {
    public static void main(String[] args){
        // 1, 1.1, 1.2, 1.3...
        // 1.5 -> 5.0
        // Java 6
        // Java 7
        // Java 1.8 - Java 8
        // Java 1.25 - Java 25
        // Basic requirements -> Java 8, Java 14/17, Java 21
        // LTS - STS, Long-term support - все проекты, которые планируются на хотя бы несколько
        // Continuous Beta - это программа, которая постоянно меняется, обновляется, интегрирует все новые функционалы
        // В таком случае - используется Short-term-support потому все новые фичи так тестируются

        // Java 25.1 - пробная версия с какими-то улучшениями, и новыми реализациями
        // Java 25.2, Java 25.3 - все это STS не окончательная версия Java 25
        // В конце концов появляется ФИНАЛЬНАЯ СТАБИЛЬНАЯ ВЕРСИЯ LTS - тут новые обновления уже существующих реализаций
        // switch() case a : ...
        // switch() ->
        // return switch() ...
        // System.out.println() - Java || C++ cout<< " " << endl;
        // cout << " " << endl == IO.println()
        useRecordClass();
    }

    public static void getJavaEight(){
        // Не было дефолтных методов
            // interface Remote { void call(); }
            // Java 8 -> interface Remote { default void call() { System.out.println("Welcome!");}
        // static methods
        // functional interface -> один метод для реализации
        // -> () {}
        Arrays.asList("Archil", "Timur", "Ivan").forEach(System.out::println);
    }

    public static void useVar(){
        // Только используется в локальных переменных
        // var пришло из JavaScript - var - variable
        // Попытка внедрения в Джаву динамической типизаций переменных
        // int x = 10; -> (int)
        // JS var x = 10; (10) -> под var, JS var убрали и добавили слово let
        var number = 10;
        var letter = 'a';
        var name = "Archil";

        System.out.println(name);
        var person = new Person("Archil", "Sikharulidze", 36, "Developer", List.of());

        System.out.println(person);

        // !!! var не может быть использован как определение типа поля класса !!!
        List<Person> staff = List.of
                (new Person("Archil", "Sikharulidze", 37, "Developer", List.of()));

        // staff.stream.filter(TYPE ?? p -> person), (var p)
    }

    public static void useStringBlock(){
        String address = "25 Main Street\n" +
                        "Anytown, USA, 12445\n";
        // UPDATED
        String blockAddress = """
                25 Main Street
                Anytown, USA, 121212""";

        System.out.println("""
                25 Main Street
                Anytown, USA, 121212""");
    }

    public static void returnSwitchValue(){
        String day = "Monday";

        int numberOfDay = switch (day){
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            default -> throw new IllegalStateException("No such day!");
        };
    }

    public static void useRecordClass(){
        Animal animal = new Animal("Lion", "Jennifer", 3);
        Animal animal1 = new Animal();

        System.out.println(animal);
        System.out.println(animal);
    }

    public static void useSealedNonSealedClasses(){
        // final - который запрещал наследоваться
        // А что если я хочу, чтобы все-таки кто-то имел право наследовать, создать исключения?
        // Я могу вместо final -> sealed permitted

        // final - полный запрет на наследование
        // sealed - запреть с исключением для некоторых
            // Если вы сделали исключение, то принимающая сторона обязательно должна быть указан как final & non-sealed
        // non-sealed - открытый класс, т.е. от него можно наследоваться
    }
}
