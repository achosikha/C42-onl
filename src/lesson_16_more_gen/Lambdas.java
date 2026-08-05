package lesson_16_more_gen;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambdas {
    public static void main(String[] args) {
        useBasicLambda();
    }

    public static void useBasicLambda(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Archil", "Yulia", "Johnny", "Jack"));
        names.forEach(System.out::println);
        System.out.println("-".repeat(50));
        // () -> System.out.println("One STRING");
        // variable -> System.out.println("Your variable is: " + variable);
        // (x, y) -> {
        // STATEMENT ONE
        // STATEMENT TWO
        // }
        names.forEach(name -> {
            System.out.println("Name is: " + name);
            System.out.println("*".repeat(20));
        });

        String name = "Archil";

        // Желание не создавать ничего лишнего, а просто сразу же получить РЕЗУЛЬТАТ ОДНОРАЗОВЫЙ
        // ВЗЯТЬ ЛЮБОЙ ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС и СРАЗУ ЖЕ ЕГО РЕАЛИЗОВАТЬ И ВЫВЕСТИ РУЛЬТАТУ
        System.out.println(new Comparable<>() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        });

        System.out.println((Comparable<Object>) o -> 0);
    }

    public static String getDay(int day){
        return switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Weekends";
            default -> "THIS IS A MISTAKE";
        };
    }
}
