package homework_2;

import java.util.Scanner;

public class MyMain {
    // Upper-Camel Case
    public static void main() {
        System.out.println("Homework 2");
        System.out.println("Task 1: ");
        calculate();
        // -
        System.out.println("-".repeat(60));
        System.out.println("Task 2:");
        getModulus();
        System.out.println("-".repeat(60));
    }

    // Правило - метод начинается всегда с глагола
    // Всегда глагол начинается с маленькой буквы
    // Потом, все остальные части следуют правилу стиля - Lowe-Camel Case
    public static void calculate(){
        // Что я должен сделать? И какой результат получить?
        // Алгоритм: определенная последовательность шагов, в определенном порядке
        // a = 4*(b+c-1)/2
        // b & c задаем в коде самостоятельно
        // 1. Создать метод
        // 2. Создать переменные типа int & double, b, c и инициализировать
        int b = 11;
        int c = 1;

        // 3. Создать переменную а и сохранить там значению вычисления 4*(b+c-1)/2
        // 4 * (double) (b+c-1)/2;
        // (double) 4 * (b+c-1)/2;
        double a = 4*(b+c-1)/2; // 4 * (10 + 1 - 1) / 2 = 20

        // 4. Вывести значение а
        System.out.println("Sum of calculated formula 4*(b+c-1)/2 -> equals: " + a);
    }

    public static void getModulus(){
        // Stack под метод getModulus()
        // -> address откуда вы пришли
        // -> Scanner input, int q, int w
        // Delete int w, int q, Scanner input, перейди по адресу откуда пришел
        // Закрой метод getModulus() очисть его стек

        // q, w -> int
        // Screen -> q % w

        // Если что-то надо написать или прочитать для этого открывается т.н. РЕСУРС
        Scanner input = new Scanner(System.in);

        // hasNext -> любой метод, который имеет слово has.... - это проверка существование
        // какого-то элемента или в массиве, в списке, в буфере...
        System.out.print("Please enter int q value: ");
        int q = input.nextInt();
        System.out.print("Please enter int w value: ");
        int w = input.nextInt();

        // q 21, w 8, % = 5
        // q 14, w 2 = 0
        // q 1 w 4
        System.out.println("Calculate modulus of numbers: q % w -> " + q + " % " + w + " = " + (q%w));

        input.close(); // Удаление объекта из памяти - это одно, а закрытие используемого ресурса - другое
    }

    public static void setScopeLifeSpan(){
        // Область видимости
        // Длительность жизни объекта или переменной

        // Где доступна ваша переменная ?
        int valueMethod = 10;

        // Любые такие кавичка создают ДОПОЛНИТЕЛЬНОЕ ПРОСТРАНСТВО - ОБЛАСТЬ ВИДИМОСТИ
        {
            int valueInternalBlock = 10;

            System.out.println(valueMethod);
            System.out.println(valueInternalBlock);
        }

        // System.out.println(valueInternalBlock); - переменная вышла за область видимости
    }
}