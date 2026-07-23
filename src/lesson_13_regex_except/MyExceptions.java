package lesson_13_regex_except;

public class MyExceptions {
    public static void main() {
        getBasicExceptions();
    }

    public static void getBasicExceptions(){
        // Исключения
        // Обработка ошибок или потенциальных ошибок

        // Самая главная задача исключений - не позволить программе сломаться без, хотя бы, соответствующего
        // сообщения, и правильного закрытия программы.
        // Максимум, если проблемы в не БАЗОВЫХ модулях, продолжить работать

        // Создание ЛОГОВ
        // Специальный документ .txt где через обработку исключений мы сохраняем данных об ОШИБКАХ
        // 23.07.2026 .txt
        // 22.58 PING IP ERROR
        try{
            System.out.println(0 / 10); // Можно
            System.out.println(10 / 0); // ERROR EXCEPTION
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        int[] numbers = {1, 9, -1, 10};

        try{
            // 0, 1, 2, 3 + 4 (ERROR)
            for(int index = 0; index <= numbers.length; index++){
                System.out.println(numbers[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("I have caught two ERRORS or EXCEPTIONS, НО МОЙ КОД НЕ ЛЕГ. Я продолжаю работать!");
    }
}
