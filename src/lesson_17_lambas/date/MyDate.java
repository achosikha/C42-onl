package lesson_17_lambas.date;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyDate {
    public static void main(String[] args){
        // Date
        // Calendar
        System.out.println(new Date());

        // LONG, сколько миллисекунд прошло с 1 января 1970 года
        long start = System.currentTimeMillis();

        int[] numbers = new int[10_000_000];

        for(int index = 1; index < numbers.length; index++){
            numbers[index] = index;
        }

        long end = System.currentTimeMillis();

        System.out.println("How many seconds I needed to go through for with 10_000_000 iterations? "
                + ((double)(end - start)/1000));

        System.out.println(new Time(2026));

        System.out.println("-".repeat(50));
        System.out.println("Use Predicate: ");
        usePredicate();
    }

    public static void usePredicate(){
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        // 4 -> 0
        System.out.println(4 % 2);

        Predicate<String> isLong = str -> str.length() > 10;
        System.out.println("If my String in more than 10 letters it is long, otherwise short: " +
                isLong.test("Pomegranate"));

        Consumer<Double> formatter = (x) -> System.out.println("add info " + x);
        formatter.accept(999.9);

        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            return userInput;
        };

        Supplier<String> supplier1 = () -> new Scanner(System.in).nextLine();

        System.out.println(supplier.get());

        Function<String, Double> parse = x -> Double.parseDouble(x);
        double result = parse.apply("5.8");
    }
}