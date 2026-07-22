package lesson_12_strings_regex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main() {
        makeFromDecimalToBinaryStringBuilder();
    }

    public static void useStringBuilder(){
        StringBuilder str = new StringBuilder("EMPTY EXTENDABLE STRING");

        // Java String - это КОНСТАНТА
        // В С++ - это обычный массив из символов

        // Расширяемый простой класс, который можно использовать как массив символов?
        System.out.println(str);

        // Если вам нужно менять строчку регулярно, то мы всегда используем StringBuilder
        // Например:
            // String str = "A";
            // str = "Ba";
            // str = "Archil";
        // Если же нам нужна КОНСТАНТА - то всегда используем String
        // Например:
            // Имя
            // Фамилия
        System.out.println(str.reverse());
        // Методы StringBuilder напрямую меняют его внутренности
        System.out.println(str);
        System.out.println(str.reverse());

        // Удалить все
        str.delete(0, str.length());
        System.out.println(str);

        str.append("Archil");
        System.out.println(str);
        str.append(" Sikharulidze is a JAVA DEVELOPER.");
        System.out.println(str);

        System.out.println(str.replace(str.length() - 1, str.length(), "!"));
        System.out.println(str.insert(0, new char[]{'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', '-', ' '}));

        // Каждое деление делать через INSERT(0, '')
    }

    public static void makeFromDecimalToBinaryStringBuilder(){
        System.out.print("Please enter a decimal number to convert to a binary system: ");
        int decimal = new Scanner(System.in).nextInt();

        StringBuilder binaryDigit = new StringBuilder();

        while (decimal > 0){
            if (decimal % 2 == 0){
                binaryDigit.insert(0, '0');
            } else {
                binaryDigit.insert(0, '1');
            }
            decimal /= 2;
        }

        System.out.println("Your binary version is: " + binaryDigit);
    }

    public static void getStringHashCode(){
        String programmingLanguage = "JAVA";
        String programmingLanguageSmall = "Java";
        String programmingLanguageComp = "C++";
        String programmingLanguageCompTheSame = "C++";

        // Если у меня, оба объекта указывают на одинаковые пространства в куче
        // Могут ли они иметь одинаковый ХешКод?
        System.out.println("JAVA: " + programmingLanguage.hashCode());
        System.out.println("Java: " + programmingLanguageSmall.hashCode());
        System.out.println("Anonymous variable -> JAVA: " + "JAVA".hashCode());
        System.out.println("Var 1 -> C++: " + programmingLanguageComp.hashCode());
        System.out.println("Var 2 -> C++: " + programmingLanguageCompTheSame.hashCode());
        String newStringCLanguage = new String("C++");
        System.out.println("C++ created with new keyword: " + newStringCLanguage.hashCode());
        System.out.println("Compare two \"C++\" constants: " + (programmingLanguageComp == newStringCLanguage));

        // "....................................................................................................."
        // "....................................................................................................."
        // equals() -> 'a' -> 'A'.........
        // 14811 == 18171
        // Сравнение целочисленных значений ВСЕГДА БЫСТРЕЕ других сравнений, особенно, СТРОЧЕК
        System.out.println("Archil".hashCode() == "Archil".hashCode());
    }

    public static void callStrings(){
        String name = "Vova";
        String secondName = "Vova";

        // 1. Во-первых, что я получу?
        // 2. Почему?

        // String - СОЗДАЕТ КОНСТАНТА - ОНА НЕИЗМЕНЯЕМА
        // String POOL (HEAP) - если есть копия, новая не создается
        // ЕСЛИ == то сравниваются ссылки

        // name -> 0x10099F -> HEAP -> String POOL "VOVA"
        // secondName -> 0x10099F -> HEAP -> String POOL "VOVA"
        // 0x10099F == 0x10099F
        System.out.println(name == secondName); // true
        String empty = "";
        String isNull = null;
        String notInitialized;
        String newString = new String("New String");
    }

    public static void moreString(){
        // toString()
        // split()
        // toUpperCase()
        // toLowerCase()
        // equals()
        // equalsIgnoreCase()
        // trim()
        // repeat()
        // toCharArray()
        // charAt()
        // indexOf()
        int number = 100;
        String strNumber = String.valueOf(number);

        // Enter number:
        // String value
        // +value JS
        int value = Integer.parseInt(strNumber);

        // Get EXPRESSION -> 78÷9−12×6+5−1÷8, "Archil" + " Sikharulidze"
        // STATEMENT -> String expression = 78÷9−12×6+5−1÷8;

        // /, *, -, +, %
    }

    public static void getMoreMethods(){
        // equalsIgnoreCase()
        // trim()
        // indexOf()

        // Kostya Ivanov -> KOSTYA IVANOV, kostya ivanov
        System.out.println("WelCOME To JAvA".equalsIgnoreCase("welcome to java"));
        System.out.println("JAVA".indexOf('A'));
        System.out.println("JAVA".compareTo("JAVA")); // 0
        System.out.println("Archil Sikharulidze is a TeachMeSkills lecturer in Java Development".contains("kill"));

        System.out.println("-".repeat(70));
        System.out.println("".isBlank()); // НИЧЕГО "" или же пробел
        System.out.println(" ".isBlank());
        System.out.println("".isEmpty()); // ТОЛЬКО ""
        System.out.println(" ".isEmpty());
    }

    public static void useTerminalCalculator(){
        System.out.println("Welcome to CALCULATOR.");
        System.out.print("Please, enter an expression and I will calculate: ");

        // ДОЛЖНА проверка? Соответствует ли ВЫРАЖЕНИЕ ПРАВИЛАМ
            // 1. Вообще выражение это выражение???? - "Привет"
            // 2. Если выражение есть, правильно ли оно прописано? - ТОЛЬКО ЧИСЛА, и СПЕЦ СИМВОЛЫ -, +, %, *, /
        String expression = new Scanner(System.in).nextLine();

        // 1. Как мне достать из моей строки все переменные?
        // 2. Надо их достать, и... ?
        // 3. Надо достать операции - *, +, -, /
        // 4. Достал, а что дальше?
        // 5. Арифметическая очередность - как обработать правильно выражение?

        // Есть спецсимволы, которые что-то обозначают кроме просто СИМВОЛА
        // *, -, .
        String[] variables = expression.split("[-*+/]");
        System.out.println(Arrays.toString(variables));

        String[] operators = expression.split("[0-9]+"); // ТОЛЬКО ОДИН СИМВОЛ 13 -> РЕШИТЬ ЭТОТ ВОПРОС?????
        System.out.println(Arrays.toString(operators));

        // Напишите МНЕ ОСТАЛЬНОЙ КОД
        // Пусть просто возьмет все переменные и все операторы и ПОД ЦЕПОЧКЕ произведет ОПЕРАЦИИ
        // 12+1/5*12-1 -> 12 + 1 -> /5 -> *12 - 1 = ????

        // Правильно вычислить выражение 12+1/5*12-1 == (((1/5) * 12) + 12) - 1 = 71
        System.out.println((double)((12 + ((1/5) * 12)) -1));
        System.out.println((double)(1/5));
    }

    public static void useMorePreciseClasses(){
        // BigInteger
        BigInteger longValue = new BigInteger(String.valueOf(4_191888_99878L));

        // BigDecimal
        // 8.99991121_2 < 8.99991121_1
        BigDecimal morePreciseDoubles = new BigDecimal(String.valueOf(456.19911111111111111111));
        morePreciseDoubles.min(BigDecimal.valueOf(45.191811191111));
    }

    public static void someMoreStr(){
        String[] randomHiddenWord = getHiddenWords();
        char[] hiddenWord = randomHiddenWord
                [new Random().nextInt(0, randomHiddenWord.length - 1)].toCharArray();
        System.out.println(Arrays.toString(hiddenWord));

        for(char letter : "Java Development".toCharArray()){
            System.out.print(String.valueOf(letter).toUpperCase());
        }
        System.out.println();
        System.out.println(String.valueOf(hiddenWord).toUpperCase());
        System.out.println(String.valueOf(hiddenWord).toLowerCase());

        String name = "Archil";
        String surname = "Sikharulidze";
        String fullName = name + " " + surname;
        System.out.println(fullName);

        // + КОНКАТЕНАЦИЯ прибавление в хвост
        // concat()
        fullName = fullName.concat(" is a Java Developer."); // Archil Sikharulidze + is a Java Developer
        System.out.println(fullName);

        // IMMUTABLE STRING - СТРОЧКА
        // charAt()
        System.out.println(fullName.charAt(0));

        for(int index = 0; index < fullName.length(); index++){
            System.out.print(fullName.charAt(index) + "\t");
        }

        // Введите одну букву
        String value = String.valueOf(new Scanner(System.in).nextLine().charAt(0));
        char letter = new Scanner(System.in).nextLine().charAt(0);
    }

    public static String[] getHiddenWords(){
        return new String[]{
                "Apple", "Car", "House",
                "Earth", "Dog", "Cat",
                "Human"
        };
    }
}
