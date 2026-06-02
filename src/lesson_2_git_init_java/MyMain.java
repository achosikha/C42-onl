package lesson_2_git_init_java;

// Правила наименования в Джаве
// Класс - ВСЕГДА ОБЪЕКТ - ЗНАЧИТ - СУЩЕСТВИТЕЛЬНОЕ
// Main - всегда пишется первая буква класса с БОЛЬШОЙ, дальше маленькими
// Zoo, Animal, Lions, MammalLions, MyMammalLions - Upper Camel Case
public class MyMain {
    // ENTRY-POINT - инициирует начала мозговой активности
    // ВСЕ МЕТОДЫ ДОЛЖНА НАЧИНАТЬСЯ С ГЛАГОЛА и использовать LOWER CAMEL CASE
    // Все методы начинаются с нижнего регистра - main, get(), getSpeed(), getMaxSpeed()
    // set(), setValue(), setMaximumValue()
    // snake-style -> get_maximum_speed, Get()
    public static void main(String[] args) {
        // Прочитать байт-код: javap -c название_класса.class
        // Скомпилировать Джава документ: javac название_класса.java
        // Показать работу компилятора, прочитать просто код: java название_класса.class
        // Интегрированная в ТЕРМИНАЛ через SDK механизм быстрой компиляции jshell

        // ВЫЗОВ МЕТОДА
        useTernaryOperator();
    }

    public static void useTernaryOperator(){
        // Если, например, Арчил старше Вадима, тогда выведи А
        // Если наоборот выведи Б - сокращенный тернарный оператор
        int ageArchil = 37;
        int ageVadim = 37;

        // (условие) ? ответ А : ответ Б
        String olderPersonName = (ageArchil > ageVadim) ? "Archil" : "Vadim";
        System.out.println(olderPersonName);

        // Вложенный тернарный оператор
        // Проверит условие А, условие Б, и последнее условие РАВЕНСТВА
        System.out.println((ageArchil > ageVadim) ? "Archil" :
                            (ageVadim == ageArchil) ? "NONE" : "Vadim");
    }

    public static void getArithmetic(){
        // +, -, /, *, % (modus)
        // int var = var + 1 == var += 1;
        System.out.println(10 % 3); // ОСТАТОК, 10 - 5 = 5, 5 - 5 = 0,
        // 10 - 3 = 7, 7 - 3 = 4, 4 - 3 = 1, 1 - 3 (нельзя) остаток = 1
        // = (задать значение)
        // >, <, >=, <=, == (5 == 5), != (не РАВНО)
        // ++ (variable + 1), -- (variable - 1)
        int number = 1;
        System.out.println(number); // 1
        number++; // 2
        System.out.println(number);
        number--; // number = number - 1;
        System.out.println(number);
        number+= 1; // number = number + 1;
        number/= 5; // number = number / 5;
        System.out.println(5 + 5 * 3);
        System.out.println((5 + 5) * 3);
        System.out.println(5 / 5 + 5 + 5 * 5); // 5/5 = 1 + 5 = 6 + 25 = 31

        // ЕСЛИ - &&, ||, ! (НЕ) - if (!isEmployed)/if (isEmployed == false)
    }

    // Приведение типов
    public static void shortToInt(){
        // Неявное (автоматические) приведение типов
        short shortVar = 123;
        int variable = shortVar;
        long longVar = variable;

        float floatVar = 12.455F;
        double doubleVar = floatVar;

        // Что если я хочу наоборот - большее вложить в меньшее?
        int smallNumber = 123;
        // Когда мы принуждаем компилятор привести тип - явное приведение типов
        byte intByte = (byte) smallNumber; // У тебя под итн - 4 байта, а ты пытаешься
        // впихнуть в переменную с 1 байтом - ЭТО НЕВОЗМОЖНО

        int biggerValue = 131;
        byte biggerByteValue = (byte) biggerValue; // байт не может хранить значение 129
        System.out.println(biggerByteValue);

        double doubleValue = 13.45955;
        int intPutDouble = (int) doubleValue;
        System.out.println(intPutDouble);
    }

    public static void useCharVariable(){
        // ASCII Table standard
        // char - на самом деле это ЧИСЛО, которое просто компилятором специально
        // превращается в символы
        char one = '1';
        char oneNumber = 43;
        char space = ' ';

        System.out.println("char one = '1': " + one);
        System.out.println("char oneNumber = 1: " + oneNumber); //
        // (тип) - ПРИВЕДЕНИЕ ТИПА - int = 32 -> 100000
        System.out.println("Space - CODE? " + (int) space); // ЧТО НАХОДИТСЯ ПОД ПРОБЕЛОМ

        char middle = 'A';
        char finalLetter = 125;

        System.out.println(middle);
        System.out.println(finalLetter);
        System.out.println(finalLetter - middle);
        System.out.println((char) (finalLetter - middle));
    }

    public static void checkVariables(){
        // Keyword -> Ключевое слово перед наименованием ПЕРЕМЕННОЙ ОПРЕДЕЛЯЕТ ТО, ЧТО МЫ МОЖЕМ В НЕЕ ВСТАВИТЬ
        // Ключевое int (integer) целое число - МОГУ ВСТАВИТЬ ТОЛЬКО ЦЕЛОЕ ЧИСЛО
        // Переменное? - ЭТО НАЗВАНИЕ (height) - под которым находится адрес в вашей памяти RAM и где хранится значение

        // БАЗОВЫЕ ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
        // В С и С++ есть типы данных которые хранят только значения с минусом (-1, -7456)
        // или только с плюсом (0 и т.д.) - В ДЖАВЕ ТАКОГО НЕТ!
        // Целочисленные

        // Stack (RAM) краткосрочная быстрая память
        // byte & short НЕ ИСПОЛЬЗУЕТСЯ ОТГОЛОСКИ ПРОШЛОГО
        byte byteVar; // byte 0x3390000f -> какое-то значение, например, 127
        short shortVar; // Переменная у которой только тип и имя - ОБЪЯВЛЕНИЕ ПЕРЕМЕННОЙ,
        // Использование локальной примитивной переменной без инициализации - ОШИБКА КОМПИЛЯТОРА
        // System.out.println(shortVar);
        byteVar = -128;
        shortVar = 31_001; // 31001 - _ для разделения значений, чтобы не путаться

        // В основном int, для очень больших чисел long
        // Для компилятора Джава тип int - дефолтная и базова, он всегда пытается привет к ней
        // Поэтому, если вы проводите какие-нибудь арифметичесие операции над например byte, short
        // они автоматом превратятся в int
        int intVar = 1_456_123_991;
        long longVar = 1_456_123_991L; // на конце l/L заставляет компилятор создать переменную типа long
        // даже если значение может быть вложено в тип int

        // С плавящей запятой
        float floatVar = -12.4567887F; // f/F .7 знаков - точность переменной
        double doubleVar = 14.7563456781023; // дефолтный тип для всех значений с плавающей запятой

        // СИМВОЛ под которым лежит INTEGER
        char number = 1; // Под 1 в таблице ASCII есть свой КОД 1 (только латиница и базовые символы)
        char letter = '#'; // # в таблице ASCII есть свой КОД
        // Есть расширенная таблица символов EXTENDED ASCII

        // Логическая переменная
        // ЛОГИЧЕСКАЯ ПЕРЕМЕННАЯ В ДЖАВЕ ЭТО НЕ ЧИСЛО! В С/С++ и других некоторых языках логическое
        // переменная на самом деле под собой имеет числовое значение 0 - ложь (false), все что НЕ НОЛЬ - истина (true)
        // int isEmployed = 0; -> false, isEmployed = 1; -> true
        // 0 - false, -1 - true, 2 - true, 1 - true
        boolean isMarried = false; // false & true

        // ЕДИНСТВЕННЫЙ НЕПРИМИТИВНЫЙ ТИП - СТРОЧКА - String
        String name = "Archil";
        String surname = "Sikharulidze";
        int age = 37;
        String profession = "Java Developer";
        boolean isEmployed = true;

        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your profession is: " + profession);
        System.out.println("Are you employed? " + isEmployed);
    }

    public static void getMessage(){
        System.out.println("This message is being invoked from method getMessage()");
    }

    public static void calculate(){
        int x = 100;
        int y = 10;

        System.out.println("Result of x/y: " + x / y);
    }
}