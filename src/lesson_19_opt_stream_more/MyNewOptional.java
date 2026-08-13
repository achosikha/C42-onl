package lesson_19_opt_stream_more;

import java.util.*;

public class MyNewOptional {
    // Lesson 18
    public static void main(String[] args){
        useStreamAPI();

        // Обратить в презенташке внимание на Arrays.stream() позволяет использовать Stream API с массивом
    }

    public static void useStreamAPI(){
        List<Person> staff = List.of(
          new Person("German", "Jdanovich", 22, "Developer",
                  List.of("Java", "SQL", "Git")),
          new Person("Valentina", "Ivanova", 20, "Manager",
                  List.of("Planning", "Meetings", "Reports")),
          new Person("Anna", "Puzikova", 29, "Developer",
                  List.of("Java", "Spring", "Testing")),
          new Person("Alexander", "Trusevich", 35, "Director",
                  List.of("Management", "Strategy", "Finance")),
          new Person("Yulia", "Abarova", 32, "Developer",
                  List.of("Java", "SQL", "Spring"))
        );

        // Все разработчики
        staff.stream()
             .filter(p -> p.getPosition().equals("Developer"))
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        // Разработчики, которые старше 25 лет
        staff.stream()
             .filter(p -> p.getPosition().equals("Developer"))
             .filter(p -> p.getAge() > 25)
             .forEach(System.out::println);

        // Взять и отсортировать весь поток по возрасту и получить новый поток объектов исходя из возраста
        System.out.println("-".repeat(100));

        staff.stream()
             .sorted(Comparator.comparing(Person::getAge))
             .forEach(System.out::println);

        System.out.println("-".repeat(100));
        staff.stream()
             .map(Person::getSurname)
             .forEach(System.out::println);

        System.out.println("-".repeat(100));

        // Есть ФИНАЛЬНЫЕ МЕТОДЫ, после которых СТРИМ/ПОТОК заканчивается, нельзя проводить манипуляции
        // Любой метод, который должен дать какой-то выводимый результат - финальный
        // List.of(), forEach(), count()
        long developers = staff.stream().filter(p -> p.getPosition().equals("Developer")).count();
        System.out.println("How many developers do we have in a List collection of STAFF? " + developers);

        System.out.println("How many developer aged above 25 do we have in a List collection of STAFF? " +
                            staff.stream()
                                 .filter(p -> p.getPosition().equals("Developer"))
                                 .filter(p -> p.getAge() > 25)
                                 .count());

        System.out.println("-".repeat(100));
        staff.stream()
             // flatMap берет поток, и создает на основе каждого объекта из метода functions еще один поток
             // new STREAM [Java, Spring, Management, Planning, Java, Spring, Git, Git, Finance...]
             .flatMap(p -> p.getFunctions().stream())
             // Этот новый поток фильтруется методом distinct() берутся только уникальные
             // [Java, Spring, Management, Planning, JAVA - DELETE...]
             .distinct()
             // Все уникальные значения сортируются
             .sorted()
             .forEach(System.out::println);
    }

    public static void getSerializableOptionalStreamAPI(){
        // Optional
        // Stream API

        // Optional - это обычный простой контейнер, который принимает Объект и благодаря встроенной функции может
        // определить есть этот объект там или нет, проверить кое-какие параметры и следовательно дать соответствующее
        // поведение

        // Serialization - implements Serializable, marker interface - ObjectInputStream
        // Deserialization - ObjectOutputStream
        Person archil = new Person("Archil", "Sikharulidze", 37,
                "Java Developer", new ArrayList<>(List.of("Coding", "Supervision")));

        // Сохранил, в тхт документе - в виде якобы кодированного текста - serialization
        // Хочу восстановить этот объект и вернуть его обратно в класс Person - Deserialization
        // Главная проблема этого подхода, невозможность изменения оригинальной структуры объекта
        // Тупо, если вы в ваш класс Person просто добавите хотя бы одно поле - вы не сможете вычитать объект,
        // сделать deserialization - и получил ОШИБКУ

        List<Person> people = List.of(
                new Person("Vova", "Ivanov", 35, "Director", new ArrayList<>()),
                new Person("Irina", "Kuzmina", 25, "Manager", new ArrayList<>(List.of("Staff"))),
                new Person("Ylia", "Mukhanov", 29, "Developer", new ArrayList<>(List.of("Coding"))),
                new Person("Anastasya", "Volochkova", 45, "Deputy Director", new ArrayList<>()),
                new Person("Grisha", "Ivanov", 34, "Soccer Player", new ArrayList<>())
        );

        // Stream API - это очень мощные функциональный механизм фильтрации объектов
        // People [Array of Person Objects]
        // stream() -> он превращает весь объект в ПОТОК, этот поток одноразовый и его результатов тоже
        // Когда вы получите поток и обработаете его - он умирает

        // Джава чистый ООП? В базовой комплектации - ДА
        // Но, все больше элементов функционального программирования, например, Stream API
        Optional<Person> person = people.stream()
                // Поток берет каждый элемент, пропускает его через проверочный конвейер
                // каждый объект поочередно хранит в переменной p и проверяет на условие
                // каждый элемент, который удовлетворяет условие ВЫХОДИТ ИЗ КОНВЕЙЕРА
                .filter(p -> p.getSurname().equals("Ivanov"))
                // Метод findFirst() говорит, что даже если у тебя 100 таких Фамилий
                // просто дай мне первый, остальные выкинь, закрой поток
                .findFirst();

        // В контейнере Optional есть объект, я не знаю он там правильный или нет
        // Этот контейнер позволяет мне сейчас проверить все правильно или нет, если ДА, продолжаем работать
        // если нет, я вывожу сообщение, что ОБЪЕКТА НЕТ
        if (person.isPresent()){
            System.out.println("Yes, you have a respective object here.");
            System.out.println(person.get());
            System.out.println("His age: " + person.get().getAge());
        } else {
            System.out.println("Something went wrong!!!!");
        }

        System.out.println("-".repeat(100));
        // Взять коллекцию List<Person> people
        // Провести его через Stream API
        // Получить все объекты с фамилией Ivanov
        // Возвращаю новый List с объектами Person у которых фамилии Ivanov
        System.out.println(people.stream()
                .filter(p -> p.getSurname().equals("Ivanov"))
                .toList());

        System.out.println("-".repeat(50));

        List<Person> sorted = people.stream()
                .filter(p -> p.getSurname().equals("Ivanov"))
                .toList();

        System.out.println(sorted);
    }
}