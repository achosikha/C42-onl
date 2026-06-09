package lesson_4_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args){
        useEnhancedForToChangeValues();
    }

    public static void useEnhancedForToChangeValues(){
        String[] names = new String[]{"Archil", "Johnny", "Nadezhda", "James"};

        System.out.println("Initial array: " + Arrays.toString(names));

        for(String name : names){
            name = "KKK";
            System.out.println(name);
        }

        System.out.println("-".repeat(50));
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("-".repeat(50));

        for(int index = 0; index < names.length; index++){
            names[index] = "KKK";
        }

        System.out.println("Updated values for array names: " + Arrays.toString(names));

        Arrays.fill(names, "FILL METHOD");

        System.out.println("UPDATED: " + Arrays.toString(names));
    }

    public static void createArrayNames(){
        // 1. Создадим программу, которая считывает со Сканнера н-ое количество имен
        // Пользователь должен самостоятельно указать сколько имен он впишет
        // После этого, он должен вписать столько имен, сколько указал в начале
        // Вме имена должны сохраниться в массиве одномерном типа Строчка,
        // А потом эти имена надо прочитать

        int namesCounter;

        do{
            System.out.print("How many names will you enter? ");

            if ((namesCounter = getInput().nextInt()) > 0) break;
            System.out.println("You have entered a WRONG VALUE!");
        } while (true);

        String[] names = new String[namesCounter]; // Создаем массив под то количество имен, которое было введено

        // index [0] < names.length
        for(int index = 0; index < names.length; index++){
            System.out.print("Please, enter name " + (index + 1) + ": ");
            names[index] = getInput().nextLine();
        }

        System.out.println("-".repeat(40));
        System.out.println(Arrays.toString(names));
        System.out.println("-".repeat(40));

        for (int index = 0; index < names.length; index++){
            System.out.println("Name " + (index + 1) + ": " + names[index]); // (index + 1) - просто как результат
            // значение индекса + 1, это не есть изменения значения индекс, index++ - это изменение значения индекса
        }

        System.out.println("-".repeat(50));
        // Java: forEach
        // Java: enhanced-for - упрощенная версия for для чтения массивов и других объектов, которые содержат элементы
        // ЕСЛИ ТОЛЬКО НАДО ПРОЧИТАТЬ, НЕ МЕНЯЕТЕ ЗНАЧЕНИЯ, И НЕ НАДО ПОЛУЧАТЬ ДОСТУП К ОТДЕЛЬНЫМ ИНДЕКСАМ
        for(String name : names){ // создаем временную переменную String name и просто поочередно вставляет туда просто
            // значения элементов names, name = "Archil", name = "Johnny"
            System.out.println("Name: " + name);
        }
    }

    public static void useArray(){
        // Одномерный массив
        // Цепочка с однотипными переменными, длину которую задает в начале и больше не можем менять
        // [1, 2, 3, 4] - ВСЕ ОДНОГО ТИПА, т.е. если я задал целочисленное значение int, то все элементы должны
        // совпадать - ИСКЛЮЧЕНИЙ НЕ МОЖЕТ БЫТЬ. Это отличается от некоторых языков, которые позволяет вставлять
        // разные значения - JS [5, 1.5, "Archil", 'c', ...]
        // int []

        // 1. Просто объявление
        int[] integerNumbers; // Java style array
        int cStyleArrayInJava[]; // Массив, объявленный в Джаве в стиле языка С

        // 2. Выделение памяти под определенное количество элементов
        integerNumbers = new int[5]; // В памяти выделится 5 элементов типа integer = 20 bytes (int 4 bytes, 5 * 4 = 20)

        // 3. Инициализация элементов в массиве

        // Ошибка, ссылка массива, квадратные скобки и ,,,, - NULL
        System.out.println(integerNumbers);

        // System.out.println(cStyleArrayInJava); -> КОМПИЛЯТОР ПРОСТО НЕ ПОЗВОЛИТ ИСПОЛЬЗОВАТЬ МАССИВ, у которого
        // нет выделенной памяти, т.е. ссылки
        System.out.println(integerNumbers[0]); // Индексация начинается с 0 - это на нашем языке первый элемент

        // 0, 1, 2, 3, 4
        // Длина массива из пяти элементов - 5, из 10 элементов 10
        // Но последний индекс 5 элемента - 4 (длина - 1), 10 - 9 (длина - 1)
        System.out.println(integerNumbers[integerNumbers.length - 1]); // .length - даем мне значение на человеческом язык, 5

        // NULL - ОБЪЕКТ ОБЪЯВЛЕН, НО ПАМЯТИ ПОКА НЕТ, ПОЭТОМУ ВМЕСТО АДРЕСА, ЧТОБЫ ТАМ НЕ БЫЛО ПУСТОТЫ ПРОСТО
        // ВСТАВЬ ПРИЕМЛЕМОЕ ЗНАЧЕНИЕ - NULL
        String name = null;
        System.out.println(name);

        // byte, short, int, long, double, float, char, boolean, String
        // Когда у меня ПРИМИТИВНЫЕ ТИПЫ, но наш КОМПИЛЯТОР САМ НИЧЕГО ИМ НЕ ПРОСТАВЛЯЕТ
        // ПРОГРАММИСТ ОБЯЗАН САМОСТОЯТЕЛЬНО ЗАДАТЬ ЗНАЧЕНИЕ
        // ТОЖЕ САМОЕ со СТРОЧКОЙ (String) - на уровне метода у СТРОЧКИ НЕТ АВТОМАТИЧЕСКОГО ЗНАЧЕНИЯ
        // ВЫ ОБЯЗАНЫ ЕЕ ЗАДАТЬ - null (если вы не знаете пока что туда вставить)
        // Ключевое слово NEW обращается с вашими переменными как с объектами - ТОГДА ДАЖЕ ЕСЛИ ВЫ НЕ УКАЗАЛИ
        // ЗНАЧЕНИЯ, ОНИ ЗАПОЛНЯЮТСЯ ДЕФОЛТНЫМИ

        // Byte, short, int, long = 0, 0, 0, 0L
        // float, double - 0.0F. 0.0
        // char - [/]
        // boolean - false
        // String - EMPTY-SPACE

        // Специальный класс Arrays.методы которые позволяют работать с массивом
        // Если вложенные опции
        System.out.println(Arrays.toString(integerNumbers));

        double[] doubleDigits = new double[10];
        System.out.println(Arrays.toString(doubleDigits));

        System.out.println(Arrays.toString(new char[10]));
        System.out.println(Arrays.toString(new String[5]));
    }

    public static void useCharLoop(){
        // FULLY EMPTY FOR
        // char with FOR

        // while(true){}
        for(;;){
            System.out.println("ETERNAL LOOP WITHOUT VARIABLES AND ACTIONS");
            break;
        }

        System.out.println("-".repeat(50));

        // ASCII table 33 - 64 (для того, чтобы пользоваться более широким ассортиментом надо использовать
        // расширенный ASCII - extended ASCII)
        for (int letter = 33; letter <= 64; letter++){
            System.out.println("ASCII table code: " + letter + " is equal to a char: " + (char) letter);
        }
    }

    public static void useAdvancedSwitch(){
        // USE LAMBDA EXPRESSIONS
        int integerDay; // Я создал переменную вне цикла, чтобы можно было его использовать вне тела

        do{
            System.out.print("Please enter day of the week (1 means MONDAY, 7 - Sunday): ");

            if ((integerDay = getInput().nextInt()) > 0 && integerDay < 8)
                break;
            System.out.println("You have ENTERED A WRONG VALUE: " + integerDay + "!");
        } while(true); // БЕСКОНЕЧНЫЙ ЦИКЛ, будет ломаться изнутри через continue & break

        switch (integerDay){
            case 1 -> {
                System.out.println("MONDAY");
                System.out.println("YOU NEED TO ADD BRACKETS IF YOU NEED TO GIVE MORE THAN ONE LINE OF A CODE");
            }
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6, 7 -> System.out.println("SATURDAY AND SUNDAY ARE HOLIDAYS!");
            default -> System.out.println("IMPOSSIBLE TO REACH!");
        }
    }

    // Classic SWITCH
    public static void useClassicSwitch(){
        // В РУССКОМ ЯЗЫКЕ "ДО" значит не включительно, ПО - значит ВКЛЮЧИТЕЛЬНО, с 1 до 10 (1, 2 ... 9)
        // Проверка правильности ввода значения - от 1 по 7, с 1 по 7 (1, 2, 3... 7)

        int integerDay; // Я создал переменную вне цикла, чтобы можно было его использовать вне тела

        do{
            System.out.print("Please enter day of the week (1 means MONDAY, 7 - Sunday): ");

            if ((integerDay = getInput().nextInt()) > 0 && integerDay < 8)
                break;
            System.out.println("You have ENTERED A WRONG VALUE: " + integerDay + "!");
        } while(true); // БЕСКОНЕЧНЫЙ ЦИКЛ, будет ломаться изнутри через continue & break

        switch (integerDay){
            case 1:
                System.out.println("MONDAY");
                System.out.println("Second LINE MESSAGE...");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
            case 7:
                System.out.println("SATURDAY AND SUNDAY ARE HOLIDAYS!");
                return;
            default:
                return;
        }
    }

    // Это специальный метод, который ВОЗВРАЩАЕТ СОЗДАННЫЙ ЭКЗЕМПЛЯР КЛАССА - Scanner
    // Scanner getInput = new Scanner (System.in) тоже самое если бы я добавил в каждый метод
    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
