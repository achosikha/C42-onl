package lesson_11_strings;

import java.util.Arrays;
import java.util.Locale;

public class MyStrings {
    public static void main() {
        // String basics
        setStringImmutable();
    }

    public static void checkBasicStrings(){
        // String - это специальный интегрированный в Джава класс
        // С++ и в более ранних языках программирования такой переменной вообще не было
        // Ее добавили попозже, или же до сих пор используют символы для реализации строк
        // Ссылочный тип
        // IMMUTABLE
        String name = "Archil"; // new ???
        String empty = ""; // EMPTY Есть объект, есть ссылка, но внутри ничего пока нет
        String surname = null; // Тут нет адреса на сам объект, но пока там лишь лежит сообщение NULL
                                // Лежит для того, чтобы я мог использовать переменную без ошибок компилятора
        String profession; // НИЧЕГО - НЕИНИЦИАЛИЗИРОВАННАЯ ПЕРЕМЕННАЯ - ОШИБКА КОМПИЛЯТОРА
        String job = new String("Java Developer");

        System.out.println("String name = \"Archil\"; -> " + name);
        System.out.println("String surname = null; -> " + surname);
        // System.out.println("String profession;" + profession);
        System.out.println("String job = new String(\"Java Developer\"); -> " + job);
    }

    public static void createStringWithNew(){
        // МАКСИМАЛЬНО СТРОКА ОПТИМИЗИРОВАНА
        // ЕЕ ЦЕЛЬ - КАК МОЖНО БОЛЬШЕ ПРОСТРАНСТВА СОХРАНИТЬ
        // ПОЧЕМУ?
        // ПОТОМУ ЧТО, стринги весят МНОГО
        // Что такое строчка? ЭТО НАБОР СИМВОЛОВ char
        // String name = "Archil" -> char[] name = new []{'A', 'r', 'c', 'h', 'i', 'l'};
        // char[] name - SIZEOF 6 bytes, char SIZE 1 byte
        String name = "Archil"; // Stack -> 0x119190F -> heap -> String Pool
        String foreignName = "Archil"; // foreignName = 0x119190F -> heap -> String Pool
        String chineseName = "Johnny";

        // new говорить СОЗДАЙ АБСОЛЮТНО НОВЫЙ ОБЪЕКТ СТРОКА
        // А это значит, что у него будет свой УНИКАЛЬНЫЙ АДРЕС
        // Даже если ЗНАЧЕНИЯ ОДИНАКОВЫЕ
        // new ломает оптимизацию и пробрасывает новую строку ВНЕ String Pool
        String russianName = new String ("Archil");

        // Compare with ==
        // Через == сравниваются не ЗНАЧЕНИЯ, а АДРЕСА
        System.out.println("COMPARE STRINGS WITH ==");
        System.out.println(name == foreignName); // TRUE, мы сравнили тут АДРЕСА, а ВОТ ПАРАДОКС, Если адреса одинаковые
                                                // то и значения строчек ВСЕГДА ОДИНАКОВЫЕ
        System.out.println(name == chineseName); // FALSE разные адерса, а значит и разные строчки
        System.out.println(name == russianName); // FALSE new создал НОВЫЙ АДРЕС, то из-за нарушения оптимизации и
                                                // выведения новой строки за String POOL, значения одинаковые, но
                                                // адреса РАЗНЫЕ, поэтому сраниваня через == ответ FALSE

        // Compare with equals()
        // СРАВНИВАЕТ ЗНАЧЕНИЯ, А НЕ АДРЕСА
        System.out.println("COMPARE STRINGS WITH EQUALS()");
        System.out.println(name.equals(foreignName)); // TRUE
        System.out.println(name.equals(chineseName)); // FALSE
        System.out.println(name.equals(russianName)); // TRUE

        // Строка в Джава ЭТО КОНСТАНТА НЕИЗМЕНЯЕМАЯ !!! ОНА ХРАНИТСЯ БЛОКАМИ ПРЯМО
        // "Арчил", "арчил", "АРчил", "АРЧИЛ Сихарулидзе", "АРЧИЛ сихаРУЛИДЗ", "Арчил" (не добавляем)
        // String Pool -> "Арчил", "арчил", "АРчил"...

        // Добро пожаловать в Грузию. Грузия великолепная страна. Она красивая, она солнечная и т.д. Грузия....

        // МЫ НИКОГДА НЕ СОЗДАЕТ СТРОКУ ЧЕРЕЗ new !!! Единственное исключение, если нам нужно создать спец строку
        // с собственным адресом и вне String POOL - это практически НИКОГДА НЕ БЫВАЕТ
    }

    public static void setStringImmutable(){
        // СТРОКА НЕИЗМЕНЯЕМА - IMMUTABLE
        // Что мы имеем ввиду?
        String job = "Java Developer"; // Константа создана
        job = "Java Developer+"; // Старая константа выброшена, и создана новая
        // Если предыдущая константа БОЛЬНЕ не используется, она уничтожается !!!

        // C++ строка ИЗМЕНЯЕМАЯ
        // char[] name = {'A', 'r', 'c', 'h', 'i', 'l'};
        // name[0] = 'K';
        System.out.println(job.charAt(0));

        String msg = "Welcome to Java Development...";

        // toCharArray() - привести к массиву знаков
        for(char letter : msg.toCharArray()){
            System.out.print(letter + "\t");
        }

        System.out.println();
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg);

        msg = msg.toUpperCase();
        System.out.println(msg);
        // msg.isEmpty(); // ""
        // msg.isBlank(); // "", " "
        // "a".repeat(100) - повторить а 100 раз

        // "Archil Sikharulidze is a Java Developer"
        String explanation = "Archil Sikharulidze is a Java Developer";
        String[] splitted = explanation.split(" ");
        System.out.println(Arrays.toString(splitted));
    }
}
