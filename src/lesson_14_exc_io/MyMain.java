package lesson_14_exc_io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        try {
            tryWithResources();
        } catch (FileNotFoundException e) {
            System.out.println("Oops... we couldn't find a file.");;
        }

        System.out.println("--------------------------------------------------------");

        readDocument();
    }

    public static void readDocument(){
        // Для хорошего и просто чтения - Scanner

        // Для более сложного ЧТЕНИЯ и ЗАПИСИ
            // FileInputStream - FileOutputStream
            // FileReader - FileWriter
            // BufferedInputStream - BufferedOutputStream
            // BufferedReader - BufferedWriter
        // Классический try-catch()
        // Расширенный try-catch-finally()
        // С закрытием ресурсов try-catch-with-resources -> try-with-resources

        // ОТКРОЕТ САМ РЕСУРС, И САМ ЖЕ ЕГО ЗАКРОЕТ. ВАМ НЕ НАДО ЗАДУМЫВАТЬСЯ НАД ТЕМ,
        // ЗАКРЫТ ЛИ РЕСУР, ОСВОБОЖДЕНА ЛИ ПАМЯТЬ. Автоматическое .close()
        try (FileInputStream readFile = new FileInputStream("src/lesson_14_exc_io/read.txt")){
            // System.out.println((char)readFile.read());
            // System.out.println(Arrays.toString(readFile.readAllBytes()));

            /*
            byte[] text = readFile.readAllBytes();
            System.out.println(Arrays.toString(text));
             */
            int letter;

            while((letter = readFile.read()) != -1){
                // Конец файла можно узнать двумя путями, спецзнак EOF - END OF FILE
                // Второй вариант значение -1
                System.out.print((char)letter);
            }
        } catch (FileNotFoundException e){
            System.out.println("Oops... There is no such file!");
        } catch(IOException e){
            System.out.println("We got some unexpected exception: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Let's WRITE SOME MESSAGE NOW.");

        // Output - есть вторая переменная
        // Вторая переменная является логическим - и задает разрешение на ДОБАВЛЕНИЕ ТЕКСТА к уже существующему
        // Если не дать разрешение, будет ЛОЖЬ и он просто перепишет все, что у вас было.
        // Удалит старое, запишет новое.
        try(FileOutputStream write = new FileOutputStream("src/lesson_14_exc_io/read.txt")){
            write.write(new byte[]{87, 65, 70, 72});
            write.flush(); // Пробросить все, что у меня в памяти, и очистить его
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void tryWithResources() throws FileNotFoundException {
        // I/O - input/output
        // System.in.read()
        // Scanner(new File("...")) - читать документ
        // File

        // Ссылка на документ
        // Можно доставать целые каталоги, и создавать
        // Проверять существуют ли документы или файлы
        // Создавать их, удалять

        // src REPOSITORY ROOT - Базовая папка, которая играет роль КОРНЕВОЙ
        // Непосредственно КОРНЕВОЙ Файл того документа, в котором он лежит
        // Для нас, для документа read.txt - первый корневой это его основной пакет - lesson_14_exc_io

        // Абсолютный путь к документу - /home/achosikha/IdeaProjects/C42-onl/src/lesson_14_exc_io/read.txt
        // Сравнительный путь - начинается от КОРНЕВОЙ ПАПКИ ПРОЕКТА
        File file = new File("src/lesson_14_exc_io/read.txt");

        // Если указанный вами адрес файла ВЕРНЫЙ
        // Если неправда, или у вас НЕПРАВИЛЬНЫЙ АДРЕС
        // Или документа просто нет
        System.out.println("Документ/файл существует? " + ((file.exists()) ? "Да." : "Нет."));
        System.out.println("Absolute File: " + file.getAbsoluteFile());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Name: " + file.getName());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Can I read a file? " + file.canRead());
        System.out.println("Can I write a file? " + file.canWrite());

        Scanner readDocument = new Scanner(new File ("src/lesson_14_exc_io/read.txt"));

        System.out.println("******************READ DOCUMENT*********************");
        while(readDocument.hasNext()){
            System.out.println(readDocument.nextLine());
        }
    }

    public static void tryNonClassic() {
        // try-catch finally
        // finally{} - всегда ВЫПОЛНИТСЯ, вне зависимости от какой-нибудь чрезвычайной ситуации
        // System.in внутри Scanner открывает внешний доступ к клавиатуре и говорит программе
        // сейчас будет ввод с внешней клавиутары
        try {
            System.out.println("Давайте поделим число на 0");
            System.out.println(10 / 0);

            int[] numbers = {9, 0, -1, 5, 6};

            for (int index = 0; index < numbers.length; index++) {
                System.out.printf("numbers[%d]: %d.", index, numbers[index]);
            }

            System.out.print("А, сейчас, мы свяжемся с клавиатурой напрямую, и введем один символ:");
            int letter = System.in.read();
            System.out.println("Your letter is: " + letter);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            // IOException эта целая категория
            // Я тут вставил проверку не просто на ввод с клавиатуры
            // А ловлю ВСЕ ОШИБКИ, которые подпадают в эту категорию
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("THIS SHOULDN'T HAVE HAPPENED!!!");
            System.out.println(e.getMessage());
        } finally {
            // Если где-то что-то все равно сделай это тело
            // Определенные процессы, которые нужно сделать или завершить
            System.out.println("FINALLY ALWAYS is INVOKED!");
        }

        System.out.println("-".repeat(70));
        System.out.println();

        Scanner readDocument = null;

        try {
            System.out.println("Давайте сейчас прочитаем документ через SCANNER.");
            File file = new File("src/lesson_14_exc_io/read.txt");
            System.out.println("Does the document exist? " + file.exists());

            if (file.exists()){
                readDocument = new Scanner(file);

                // Если я хочу прочитать все строки
                // Надо добавить проверку, есть ли дальше строка
                // И поглотить ее

                // Только одна строка
                System.out.println(readDocument.nextLine()); // Каретка сдвинулась на конец первой строки

                System.out.println("-".repeat(70));

                // Если мы хотим, чтобы над документ вновь указывал на НАЧАЛО документа или какой-то кусок
                // Надо ему это подсказать, он автоматически не будет откатываться
                while(readDocument.hasNext()){ // документ уже указывает на конец первой строки, и оттуда начнем читать
                    System.out.println(readDocument.nextLine());
                }

                System.out.println("Я прочитал документ ДО КОНЦА. Могу ли я его просто взять и опять прочитать?");

                // !!! НЕЛЬЗЯ, БЕЗ ПРОВЕРКИ СЛЕДУЮЩЕГО ЭЛЕМЕНТА БУДЕТ ОШИБКА !!!
                while (readDocument.hasNext()){
                    System.out.println(readDocument.nextLine()); // Ваша каретка в КОНЦЕ ДОКУМЕНТА, ПОПЫТКА ВЫЧИТАТЬ
                    // Приведет к ошибку, поэтому любое чтение всегда должно
                    // начинаться ПРОВЕРКИ
                }

                // !!!!!
                // ПРОВЕРИТЬ КАК МОЖНО, ЕСЛИ МОЖНО, ВЕРНУТЬ УКАЗАТЕЛЬ В ОБЪЕКТЕ readDocument в изначальное состояние
                // !!!!!

                // Чтобы брать от каретки до начала СИМВОЛА пробела
                /* ПО словам, от начала до пробела
                    while (readDocument.hasNext()){ -> hasNext() - проверь существование следующего элемента в очереди
                    System.out.print(readDocument.next()); -> возьми следующий элемент, 1, проверка есть 2, взял 2
                }
                 */
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops... No such FILE HAD BEEN FOUND!");
            System.err.println(e.getMessage());
        } finally {
            // assert УБЕДИСЬ И ПРЕДПРИМИ ШАГ, ТОЛЬКО ЕСЛИ НЕ РАВНЯЕТСЯ null
            assert readDocument != null;
            readDocument.close();
        }
    }

    public static void getExceptionsBasics(){
        // Object -> Throwable -> Exception, ERROR (Machine driven mistakes)
            // Exception
                // Checked - Unchecked
                // Unchecked - непроверяемые, это когда компилятор может знать, но не предпринимает никаких шагов
                // Например, деление на ноль, он знает, подстветит, но считает, что вы достаточно умны, чтобы не делать
                // Unchecked exceptions дают нам ОШИБКУ ОДНОГО ТИПА -
        // System.out.println() - ОШИБКИ на этапе компиляции, которые не позволяют собрать БАЙ-КОД, называются Compile-time
        // errors, компилятор прочитав код не смог его собрать, и на этапе компиляции завершился

        // Ошибки, которые происходят во время ЧТЕНИЯ и ВЫПОЛНЕНИЯ уже откомпилированного кода, называются Run-Time
        // Exceptions - System.out.println(10 / 0);

        try{
            System.out.print("Пожалуйста введите лишь один символ: ");
            int letter = System.in.read();
            System.out.println("Your LETTER is: " + (char)letter);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(10 / 0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("-".repeat(50));

        try{
            int[] numbers = {9, -1, 0, 10, 11};

            for(int index = 0; index <= numbers.length; index++){
                System.out.println(numbers[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Message after possible second exception...");
    }
}
