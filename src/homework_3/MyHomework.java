package homework_3;

import java.util.Scanner;

public class MyHomework {
    public static void main() {
        sumNumbers();
    }

    // Напишите программу, где пользователь вводит любое целое положительное число. А
    // программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    // числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    // ввести некорректные данные.
    // ЕСЛИ ТОЛЬКО от 1 ДО МАКС
    public static void sumNumbers() {
        int maxValue;

        do {
            System.out.print("Please, enter maximum value from 1 to MAX number: ");
        } while ((maxValue = new Scanner(System.in).nextInt()) < 1);

        int sum = 0;

        if (maxValue == 1) {
            sum += 1;
        } else {
            for (int counter = 1; counter < maxValue; counter++) {
                sum += counter;
            }
        }

        System.out.println("Sum of values from 1 to " + maxValue + " equals to: " + sum);
    }

    public static void sumNumbersComplicated(){
        // Алгоритм:
            // 1. Создать метод - вот это и есть программа
            // 2. Ввести максимальное число
            // 3. Суммировать все числа от 1 до МАК_ЧИСЛО
            // 4. Сканнер использовать
            // 5. Проверка правильности ввода максимального числа
        // 1. Создать метод
        // 2. Создать возможность ввода максимального значения через класс Сканнер
        // 3. Проверить валидность веденного максимального числа, пользовать должен вводить столько раз, сколько нужно
        // пока условие не будет удовлетворено;
        // 4. Создать механизм подсчета суммы всех значений от 1 до МАКС (от 1 ПО МАКС)
        // 5. Вывести сумму на экран.
        int maxValue;

        do{
            System.out.print("Please, enter maximum value from 1 to MAX number: ");
        } while((maxValue = new Scanner(System.in).nextInt()) < 1);

        // От 1 по МАКС
        // 1 = 1
        // 2 = 1 + 2 -> 3
        // 3 -> 1 + 2 + 3 -> 6
        // 4 -> 1 + 2 + 3 + 4 -> 10

        // От 1 до МАКС
        // для 1 должно быть какое-то специфическое значение
        // 1 = 0
        // 1 = 1
        System.out.print("Would you like to APPLY \"ПО\"(true) or \"ДО\"(false)");

        int sum = 0;

        if (new Scanner(System.in).nextBoolean()){
            // int sum, int = 1 <= MAX
            for (int counter = 1; counter <= maxValue; counter++){
                sum += counter;
            }
        } else {
            // int sum, int = 1 < MAX
            if (maxValue == 1){
                sum += 1;
            }

            for (int counter = 1; counter < maxValue; counter++){
                sum += counter;
            }
        }

        System.out.println("Sum of values from 1 to " + maxValue + " equals to: " + sum);
    }
}

// ПО
// 1 - 1
// 2 - 1 + 2 = 3
// 3 - 1 + 2 + 3 = 6

// ДО
// 1 - 1
// 2 = 1
// 3 = 1 + 2 = 3
// 4 = 1 + 2 + 3 = 5
// 5 = 1 + 2 + 3 + 4 = 10