package lesson_3_flow_operators;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

// 1.1 (Java 1), 1.2 (Java 2), Java 5, 1.8 (Java 8) -> Java 11, 14, 17, 21, 25
public class MyFlowOperators {
    public static void main(String[] args) throws IOException {
        // Java 26 (LTS - LONG-TERM SUPPORT) - Java 26.2.1 (STS - SHORT-TERM SUPPORT)
        // Conditional (условные)(ветвления) - if, else if, switch
        // Loops - циклы
        // Операторы прерывания - break, continue, return
        keyWords();
    }

    public static void keyWords(){
        // break
        // continue
        // return

        // break - используется для того, чтобы прервать структуру
        for (int index = 1; index <= 10; index++){
            if (index == 6){
                break;
            }
            System.out.println(index);
        }

        // Просто пропустить одну итерацию
        for (int index = 1; index <= 10; index++){
            if (index == 6) continue;
            System.out.println(index);
        }

        // return
        for (int index = 1; index <= 10; index++){
            if (index == 6) return;
            System.out.println(index);
        }

        System.out.println("ВЫ СЮДА НИКОГДА НЕ ПРИДЕТЕ, ПОСКОЛЬКУ RETURN СЛОМАЕТ ВЕСЬ МЕТОД!");
    }

    public static void useLoops(){
        // Мне нужно определенное количество раз повторить что-то?
        // Цикл - while, do while, for
        // Вывести от одного до 10
        int count = 1;

        while(count <= 10){
            System.out.println(count++);
        }

        System.out.println("-".repeat(50));

        // do while
        count = 1;
        do{
            System.out.println(count++);
        } while(count <= 10);

        System.out.println("-".repeat(50));
        // for
        for (int index = 1, counter = 2; index <= 10; index++, counter++){
            System.out.println(index);
        }
    }

    public static void useSwitch(){
        System.out.print("Enter day of the week: ");
        String day = new Scanner(System.in).nextLine();

        switch(day){
            case "Monday":
                System.out.println("Today is " + day);
                break;
            case "Tuesday":
                System.out.println("Today is " + day);
                break;
            case "Wednesday":
                System.out.println("Today is " + day);
                break;
            case "Thursday":
                System.out.println("Today is " + day);
                break;
            case "Friday":
                System.out.println("Today is " + day);
                break;
                // if (Saturday || Sunday)
            case "Saturday":
            case "Sunday":
                System.out.println("Today is a HOLIDAY!");
                break;
            default:
                System.out.println("NO SUCH DAY AT ALL!");
        }
    }

    public static void useManyIfStatements(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter day of the week (Monday, Tuesday...): ");

        // Алгоритм: написать полностью без УЧЕТА РЕГИСТРА день недели и исходя из ответа
        // получить соответствующее сообщение
        String dayWeek = input.nextLine();

        // СТРОЧКИ НИКОГДА НЕ СРАВНИВАЕМ ЧЕРЕЗ ЗНАКИ ==
        // Для сравнения используем название переменной.equals(переменная_строчка)
        // .equals() сравнение с учетом регистра
        // без учета регистра .equalsIgnoreCase()
        if (dayWeek.equalsIgnoreCase("Monday")){
            System.out.println("Today is MONDAY. WORKING TIME!");
        }

        if (dayWeek.equalsIgnoreCase("Tuesday")){
            System.out.println("Today is TUESDAY. ONE MORE WORKING DAY!");
        }

        if (dayWeek.equalsIgnoreCase("WEDNESDAY")){
            System.out.println("Today is WEDNESDAY. IN THE MIDDLE!");
        }

        if (dayWeek.equalsIgnoreCase("THURSDAY")){
            System.out.println("Today is THURSDAY. FINAL IS CLOSE!");
        }

        if (dayWeek.equalsIgnoreCase("FrIdaY")){
            System.out.println("Today is FRIDAY. WORKING WEEK IS OVER!");
        }

        if (dayWeek.equalsIgnoreCase("Saturday") || dayWeek.equalsIgnoreCase("Sunday")){
            System.out.println("HOLIDAYS!");
        }

        //
        // ПРАВИЛЬНО, использовать цепочку, чтобы показать компилятору: если ответ уже есть, не надо ИСКАТЬ!
        if (dayWeek.equalsIgnoreCase("Monday")){
            System.out.println("Today is MONDAY. WORKING TIME!");
        } else if (dayWeek.equalsIgnoreCase("Tuesday")){
            System.out.println("Today is TUESDAY. ONE MORE WORKING DAY!");
        } else if (dayWeek.equalsIgnoreCase("WEDNESDAY")){
            System.out.println("Today is WEDNESDAY. IN THE MIDDLE!");
        } else if (dayWeek.equalsIgnoreCase("THURSDAY")){
            System.out.println("Today is THURSDAY. FINAL IS CLOSE!");
        } else if (dayWeek.equalsIgnoreCase("FrIdaY")){
            System.out.println("Today is FRIDAY. WORKING WEEK IS OVER!");
        } else if (dayWeek.equalsIgnoreCase("Saturday") || dayWeek.equalsIgnoreCase("Sunday")){
            System.out.println("HOLIDAYS!");
        } else {
            System.out.println("Если вы читаете этот ответ, значит вы ввели какой-то неправильный день недели!");
        }
    }

    public static void useConditionals(){
        // if, else if, switch
        // Если
        boolean isJavaDeveloper = false;

        System.out.print("Are you a Java Developer? ");
        // ! - не, (!_логическая_переменная) - ЕСЛИ НЕ ИСТИНА
        if (isJavaDeveloper) // if (isJavaDeveloper == true) -> if (isJavaDeveloper != true) -> if (!isJavaDeveloper)
            System.out.println("Yes, I am.");
        System.out.println("No I am not.");

        // if (isJavaDeveloper){
        //     System.out.println("Yes, I am.");
        // }

        // Да, я Джава Разработчик.
        // Меня зовут ... и другие данные
        if (isJavaDeveloper){
            System.out.println("Да, я Джава Разработчик.");
            System.out.println("Я занимаюсь разработкой программного обеспечения...");
        }

        System.out.println("-".repeat(50));

        // Использовать два if
        if (isJavaDeveloper) System.out.println("Yes, I am Java Developer.");
        if (!isJavaDeveloper) System.out.println("No, I am not Java Developer.");

        System.out.println("-".repeat(50));

        // Правильная альтернатива
        if (isJavaDeveloper){
            System.out.println("Yes, I am Java Developer.");
        } else {
            System.out.println("No, I am not Java Developer.");
        }
    }

    public static void getValues(){
        System.out.print("Please enter float number 1: ");
        double doubleNumberOne = new Scanner(System.in).nextDouble(); // анонимный экземпляр класса
        System.out.print("Please enter float number 2: "); // нет постоянного имени переменной, одноразовое
        double doubleNumberTwo = new Scanner(System.in).nextDouble();

        // BigInteger/BigDecimal
        // Math разные методы, которые позволяют правильно сравнивать нецелочисленные значения
        // 34.5 == 34.5, 34.31211 == 34.1111
        String msg = (doubleNumberOne > doubleNumberTwo) ? "Double number ONE is SUPERIOR!" :
                        (doubleNumberOne == doubleNumberTwo) ? "THEY ARE EQUAL!" : "Double number TWO is SUPERIOR!";

        System.out.println(msg);
    }

    public static void useConditionalOperators(){
        // Ternary operator
        System.out.println((10 > 9) ? true : false); // (условие) ? ответа_А : (условие) ? ответ_Б : ответ_В;

        // if
    }

    public static void makeInput() throws IOException {
        // System.in()
        System.out.print("Пожалуйста введите один символ: ");
        char letter = (char) System.in.read(); // Одна буква

        System.out.println("Вы ввели следующий символ: " + letter + ". А это в таблице ASCII code: " + (int) letter);
    }

    public static void useScanner(){
        // Scanner - это специальный класс не только для ввода с консоли, но и для чтения документов
        // Для ввода с консоли
        // Scanner, System, MyMain - классы

        // У них СТРОЧКА - НАБОР СИМВОЛОВ
        // Символ - одно значение
        // Слово - набор символов БЕЗ ПРОБЕЛА
        // Предложение - это все от начала каретки ДО СПЕЦСИМВОЛА КОНЦА СТРОКИ - ENTER '\n'
        Scanner input = new Scanner(System.in); // input ЭКЗЕМПЛЯР КЛАССА Scanner
        System.out.print("Пожалуйста, введите свое имя: ");
        String name = input.nextLine(); // nextLine - взять все ЧТО СТРОЧКА - '\n' - "Archil Sikharulidze" + '\n'
        System.out.print("Please enter your surname: ");
        String surname = input.nextLine();
        System.out.print("Please enter your age: ");
        int age = input.nextInt(); // 37 + '\n'
        // КАК-ТО ЗАСТАВИТЬ ОЧИСТИТЬСЯ БУФЕР или Просто сожрать все заранее или же сделать профессионально
        // Обычно все данные у нас именно в СТРОЧКАХ - МАЛЕНЬКОЕ ЗАДАНИЕ: попытайтесь у себя найти возможность
        // через эту же программу - ПРОСТО ОЧИСТИТЬ БУФЕР, может методом...
        input.nextLine(); // Все что в буфере сожрет, и не позволит дальше меня мучать
        System.out.print("Please enter your profession: ");
        String profession = input.nextLine();
        System.out.println("Are you employed? ");
        boolean isEmployed = input.nextBoolean();

        // Спецзнаки с С/С++, которые до сих пор активно используются для модификации строчек во время компиляции
        // Символ новой строки - \n, символ табулация - \t.
        /*
        System.out.print("Your name is: \n\t" + name + ".\nYour surname is: \n\t" + surname + ".\n" +
                            "Your age is: \n\t" + age + ".\nYour profession is: \n\t" + profession + ".\n" +
                            "Are you employed?\n\t" + isEmployed + ".\n");

        System.out.println("-".repeat(50));
         */

        System.out.println("Your name is:\n\t" + name + ".");
        System.out.println("Your surname is:\n\t" + surname + ".");
        System.out.println("Your age is: \n\t" + age + ".");
        System.out.println("Your profession is: \n\t" + profession + ".");
        System.out.println("Are you employed?\n\t" + isEmployed + ".");

        // Консоль - принимает значения - БУФЕР (Archil + '\n') <- nextLine (Из буфера берет ВСЕ и буфер ПУСТОЙ)
        // Sikharulidze + '\n' <- nextLine (все сжирает и БУФЕР пустой)
        // nextInt - ТОЛЬКО ЧИСЛО и ЦЕЛОЧИСЛЕННОЕ - 37 + '\n' <- nextInt сжирает только целочисленное значение
        // Поэтому в буфере у нас остается - СИМВОЛ переходна на следующую строчку - '\n'
        // Profession -> Открывает буфер и видит, что тут НЕ ПУСТОЙ в нем уже есть что-то, а это можно прочитать
        // Поэтому, считает что вы уже ввели строку и просто сжирает остаток
    }

    public static void getPrimitiveTypes(){
        // double (говорю компилятору, выделу мне память под это значение 16 байтов)
        // weight - это просто набор символов для человека под ним реальный адрес в РАМ 0x1193433f
        // Если вы перейдете по адресу там будет непосредственно значение 67.....
        double weight = 67.1334;
    }
}