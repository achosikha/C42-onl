package lesson_18_api_stream_more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyOptional {
        Person person = new Person(); // Тут нельзя получить null, будет ОШИБКА - Wrong type - NullPointerException
        Optional<Person> personClass; // ЭТО КОНТЕЙНЕР, который по идее должен получить на хранение класс Person
        // Однако, если произошла ошибка и мы получаем null он может подстраховать, не вывести ошибку, а позволить
        // обработать полученные данные

        public static void main(String[] args) {
            // Optional
            //Optional
            var person = new ITStaff();

            // var noPointer = null; -> var ОПРЕДЕЛЯЕТ ТИП ПЕРЕМЕННОЙ ПО ДИНАМИЧЕСКОМУ ПРИНЦИПУ
            // null - это не тип данных, это просто отсутствие ссылки
            readArrayList();
        }

        public static void readArrayList(){
            ArrayList<String> names = new ArrayList<>(
                    Arrays.asList("Anna", "Leo", "Archil", "Gosha", "Katya", "Yu", "Dasha", "Masha", "John", "Ken"));

            for(String name : names){
                System.out.println(name);
            }

            // Использование Iterable
            names.forEach(System.out::println);
            // Использование Iterable + Lambda
            names.forEach(name -> System.out.println("Your name is: " + name));

            // Stream API
            // Возьми из этого списка лишь те значения, которые удовлетворяют определенные условия и сразу же мне их выведи

            // В некоторых условиях можно использовать и с обычными массивами, но в основным с КОЛЛЕКЦИЯМИ
            // names.stream() ПРЕВРАЩАЕТ В нить/поток данных.______пускаем данные на конвеер__фильтруем__проводим_
            // какие-то дополнительные операции.дай_мне_результат
            System.out.println(names.stream().filter(name -> name.startsWith("A")).count()); // 1
            System.out.println(Arrays.toString(names.stream().filter(name -> name.startsWith("A")).toArray()));

            System.out.println("-".repeat(50));
            System.out.println("How many names have at least four letters? " +
                    names.stream().
                            filter(name -> name.length() > 4).
                            count());
            System.out.println("Give me all names that have more than four letters: " +
                    Arrays.toString(
                            names.stream().
                                    filter(name -> name.length() > 4).
                                    toArray()));

            // Pattern - Matcher
            // ПРОВЕРИТЬ СТРОЧКУ НА ПРАВИЛЬНОСТЬ ВВОДА ЭЛЕКТРОННОЙ ПОЧТЫ
        }

        public static void useOptionalString(){
            Optional<String> empty = Optional.empty(); // null
            System.out.println(empty); // Ждем когда какой-то объект тут появится

            // STREAM API + Optional
            List<String> companyNames = Arrays.asList( "TMS", "Oracle", "Microsoft");

            // Optional<Person>
            // Optional<List<String>> - Optiona<Generic> - <List<String>>
            Optional<List<String>> listOptional = Optional.of(companyNames);
            int size = listOptional.map(List::size).orElse(0);
            System.out.println(size);
        }
    }

    class Person{
        //
    }

    class ITStaff{
        //
    }
