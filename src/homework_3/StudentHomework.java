package homework_3;

import java.util.Scanner;

public class StudentHomework {
    Scanner scanner = new Scanner(System.in);

    static void main() {
        StudentHomework lesson3 = new StudentHomework();
        //Задача 1:
        System.out.println(lesson3.taskOne());
        //Задача 2:
        System.out.println(lesson3.taskTwo(-21));
        //Задача 3:
        lesson3.taskThree();
        //Задача 4:
        lesson3.taskFour();
        //Задача 5:
        lesson3.taskFive();
    }

    /*
    Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на выход
будет выводить сообщение четное число или нет. Для определения четности числа
используйте операцию получения остатка от деления (операция выглядит так: '% 2').
     */
    public String taskOne() {
        System.out.print("Введите число: ");
        return (scanner.nextInt() % 2 == 0) ? "Четное число" : "Нечётное число";
    }

    /*
    Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
     */
    public String taskTwo(int t) {
        if (t > -5) {
            return "«Warm»";
        } else if (t >= -20) {
            return "«Normal»";
        } else {
            return "«Cold»";
        }
    }

    /*
    Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
     */
    public void taskThree() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Число: " + i + " в квадрате = " + (i * i));
        }
    }

    /*
    Задача 4:
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
     */
    public void taskFour() {
        int a = 7;
        while (a < 100) {
            System.out.print(a + " ");
            a += 7;
        }
    }

    /*
    Задача *:
Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
ввести некорректные данные.
     */
    public void taskFive() {
        System.out.print("Введите положительное число: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Некорректное число");
            return;
        }

        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Некорректное число");
        } else {
            int sum = 0;
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            System.out.println("Сумма всех чисел от 1 до " + a + " = " + sum);
        }
    }
}
