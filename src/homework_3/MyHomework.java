package homework_3;

import java.util.Scanner;

public class MyHomework {
    public static void main() {
        SumNumbers();
    }

    public static void SumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();
        int sum = 0;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1 до " + number + "равна: " + sum);
        } else if (number == 0) {
            System.out.println("Сумма чисел от 1 до 0 равна: 0");
        } else {
            System.out.println("Пожалуйста,введите положительно целое число.");
        }

    }
}
