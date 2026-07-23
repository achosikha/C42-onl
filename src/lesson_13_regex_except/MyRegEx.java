package lesson_13_regex_except;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegEx {
    public static void main() {
        usePatternMatcher();
    }

    public static void basicRegEx(){
        // - FROM TO, "-"
        // a-z нижний регистр
        // 5 - 7

        // A-z0-9_ == w != W
        // .
        String[] split = "Archil Sikharulidze is a Java Developer.".split("^[a-z]{5,7}$");

        System.out.println(Arrays.toString(split));

        // [abc] - [a-c]
        // [0123456789] == [0-9]
        // "^[]$"
        // Если является буквами - абв ^[абв], если не является буквами абв - [^абв]
        // "[^абв] ! не
        String[] splitLetters = "AbC A-z".split("[A-Za-z]"); // A-Z, a-z

        //  [[]] == (())
        // Найди мне строчку, где есть сочетание букв большого регистра от A-Z и чтобы они были два раза подряд
        // "^[A-Z]{2}" -- AB, AF, ZT
    }

    public static void getBasicRegularExpression(){
        // Строгая проверка соответствия электронной почты
        // ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$

        // Проверка номера
        // ^(?:\+?1[-. ]?)?\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$

        String arithmeticOperation = "29+1+19/100*5*5-10-1";

        System.out.println("\"Archil Sikharulidze\""); // Archil SIkharulidze - "Archil Sikharulidze"

        // \, -, ., ' - НАДО ЭКРАНИРОВАТЬ, т.е. сказать компилятору, чтобы он использовал по прямому назначению,
        // точка - это точка, тире - это минус или знак минуса
        String[] splitArithmeticOperation = arithmeticOperation.split("[/*\\-+]"); // \\-, \\., \\'
        String[] splitArithmeticOperationNew = arithmeticOperation.split("[/*+-]");

        // JAVA ЭКРАНИРОВАНИЕ ? ЕСТЬ СПЕЦСИМВОЛЫ В ЯЗЫКЕ, которые что-то означают вне его стандартного восприятия
        // . (в рег. выраж. также может обозначать любой символ), \., \\.
        System.out.println(Arrays.toString(splitArithmeticOperation));
        System.out.println(Arrays.toString(splitArithmeticOperationNew));

        // А как изъять из СТРОЧКИ непосредственно операции?
        // 29+1+19/100*5*5-10-1

        // 23+1+99
        String[] operationSymbols = arithmeticOperation.split("[0-9]+"); // от 0 по 9, 1 и н-кол-во раз
        System.out.println(Arrays.toString(operationSymbols));
    }

    public static void usePatternMatcher() {
        String msg = "Welcome to TMS QA Course at TMS. A-z";
        String[] splitMsg = msg.split("[A-z]"); // [от большой буквы A по маленькую букву z]
        String[] splitMsgBlock = msg.split("A-z"); // Это не диапазон а БЛОК - КОНСТАНТА "A-z"

        System.out.println(Arrays.toString(splitMsg));
        System.out.println(Arrays.toString(splitMsgBlock));

        // RegEx - [что мы ищем?] дальше какое количество раз {}
        // 1234+34+1
        // [0-9]+ == [0-9]{1, }
        // -?[0-9] - что знак - может быть, а может и не быть, но дальше будет числовой знак от 0 по 9
        // ^[0-9] - строка начнется с знака от 0 по 9
        // [^123] - не учитывай 123
        // [0-9]+\\.[0-9]$

        // Любое числовое значение от 0 по 9 и оно должно быть дву или трехсоставным, 25, 145...
        Pattern pattern = Pattern.compile("[0-9]{2,4}");

        // Добро пожаловать в нашу страну. Эте великолепное государство - "^[A-Za-z]{4,8}$"

        // Это движок, который запускает пойск по шаблону, он может также вообще подсказать этот шаблон существует или
        // НЕТ. Группирует данные и можно их дальше сохранять или выводить
        Matcher matcher = pattern.matcher("0+13+145+25+1+12+4+10+1234+56718"); // 13, 145, 25, 12, 10

        System.out.println(matcher.groupCount());
        matcher.lookingAt();
        // Класс создает целый ряд групп, в которых хранит данные в каком отрывке были найдены совпадения и какие
        while (matcher.find()) {
            System.out.println("Matching index starts at: " + matcher.start());
            // group() - где и что
            System.out.println(matcher.group());
            System.out.println("Matching index ends at: " + matcher.end());
        }

        // Some mostly used methods
        // matcher.appendTail();
        // matcher.region();
        // matcher.replaceAll();
    }
}
