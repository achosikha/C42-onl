package lesson_12_strings_regex;

import java.util.Scanner;

public class Recursion {
    public static void main() {
        makeBasicRecursion();
    }

    // Рекурсия - хвостовая рекурсия
    public static void makeBasicRecursion(){
        // Если что-то можно сделать через ЦИКЛ, то не надо заигрывать с рекурсией
        // Рекурсия - самовызов ДО ОПРЕДЕЛЕННОГО УСЛОВИЯ
        // !!! Метод вызывает самого себя !!!
        // Если УСЛОВИЯ - то мы уходим вы неконтролируемую РЕКУРСИЮ, пока ваша память не умрет
        // Рекурсия сжигает много памяти - каждый вызов это дополнительная память

        // От 1 до 10
        // Зачем?
        for (int counter = 1; counter <= 10; counter++){
            System.out.println(counter);
        }

        System.out.println("-".repeat(50));
        System.out.println("Lets use RECURSION now...");
        countToTen(1, 10);

        System.out.println("-".repeat(50));
        turnDecimalToBinary();
    }

    public static void countToTen(int min, int max){
        if(min <= max) {
            System.out.println(min);
            countToTen(min + 1, max);
        }
    }

    public static void turnDecimalToBinary(){
        // Получаю десятичное значение числа 11
        // Должен его обработать и выдать БИНАРНОЕ значение - 0...1

        // 11/2 = 5 (1)
        // 5/2 = 2 (1)
        // 2/2 = 1 (0)
        // 1/2 = 0 (1)

        // 11 == 1101 - ERROR
        // Бинарные значения проставляются СПРАВА на ЛЕВО
        // 1011

        // 1101
        // Арчил + .... -
        // <- 1011

        // Array -> Узнать сколько значений
        // Создать массив с этим размером
        // И проставить значения с конца
        System.out.printf("Please enter a decimal number to convert to a binary system: ");
        int decimal = new Scanner(System.in).nextInt();

        int counter = 0;
        int temp_decimal_number = decimal;

        while (temp_decimal_number > 0){
            temp_decimal_number /= 2;
            counter++;
        }

        int[] binary = new int[counter];

        for (int index = counter - 1; decimal > 0; index--, decimal /= 2){
            if (decimal % 2 == 0){
                binary[index] = 0;
            } else {
                binary[index] = 1;
            }
        }

        System.out.printf("Your binary version is: ");

        for (int index = 0; index < counter; index++){
            System.out.printf("%d", binary[index]);
        }

        System.out.printf("\n");

        // Рекурсия МЕНЯЕТ ЦИКЛ, вместо ЦИКЛА
        // В коде используется массив, но МОГУ ЛИ Я ИСПОЛЬЗОВАТЬ РЕКУРСИЮ, ЧТОБЫ ПРОСТО ПЕРВОЕ СДЕЛАТЬ ПОСЛЕДНИМ?
        // Посмотрите ПРИМЕР - ХВОСТОВОЙ РЕКУРСИИ
    }
}