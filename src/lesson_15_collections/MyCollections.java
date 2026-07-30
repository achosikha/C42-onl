package lesson_15_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollections {
    public static void main() {
        // METHOD CALL
        useLinkedList();
    }

    public static void getBasicCollections(){
        // Iterable
            // Collection
                // List (список)
                // Set (задать, данность)
                // Queue (очередь)

        // MAP отдельно
        // Все категории, т.е. папочки, это интерфейсы
        // Никогда мы не используем пережиток С++ Vector, Stack
        // Отдельно, может пригодиться, но очень редко, HasTable как отдельный контейнер

        // Главная разница в коллекциях, это КАК ХРАНЯТСЯ ДАННЫЕ И КАК МЫ К НИМ ПОЛУЧАЕМ ДОСТУП
        // Самый простой формат хранения это СПИСОК - List
            // ArrayList
            // LinkedList
        List<String> list = List.of("Archil", "Vova", "Yuri", "Kristina", "Vova");
        System.out.println(list);

        System.out.println("-".repeat(70));

        // У меня есть ИНДЕКСЫ, list.get()
        // Значит, я могу напрямую обращаться к каждому элементу отдельно !!!
        // List -> size() это альтернативы length()
        for(int index = 0; index < list.size(); index++){
            System.out.printf("list[%d]: %s.\n", index, list.get(index));
        }

        System.out.println("-".repeat(70));

        for (String element : list){
            System.out.println(element);
        }

        // Расширяемый список или Расширяемый список
        // Массив, однотипный, с индексами, и ОЧЕРЕДНОСТЬ ВСТАВКИ ЭЛЕМЕНТОВ СОХРАНЯЕТСЯ
        // Доступ также можно получить по ИНДЕКСАМ
        // Под капотом стандартный массив, который вместо вас будет пересоздаваться, уменьшаться или увеличиваться
        // В таком списке дозволяются ДУБЛИРОВАНИЯ ЗНАЧЕНИЙ

        // list.addFirst("Johnny"); -> RUN-TIME ERROR
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());

        // Любое добавление элемента в коллекцию дает логическую переменную
        // Да - если успешно, нет - если элемент бе был добавлен
        System.out.println(numbers.add(156));
        System.out.println(numbers.add(6));
        System.out.println(numbers.add(1));
        System.out.println(numbers.add(-11));
        System.out.println(numbers.add(-11));

        System.out.println(numbers);

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        System.out.println("Let's add first element - 9");
        numbers.addFirst(9);
        System.out.println("Let's delete the last element.");
        numbers.removeLast();
        System.out.println(numbers);
        numbers = numbers.reversed(); // Надо самому себе задать
        System.out.println(numbers);
        System.out.println("Let's clear the whole collection.");
        numbers.clear();
        System.out.println(numbers);

        // Если мы хотим получить полноценный доступ ко всем методам ArrayList надо создать на собственной же основе
        ArrayList<Double> doubles = new ArrayList<>(List.of(45.1, 67.24, 9.1, 0.1));
        System.out.println(doubles);
    }

    public static void useLinkedList(){
        LinkedList<Character> characters = new LinkedList<>(List.of('X', '-', 'Y', '}', '-'));
        System.out.println(characters);

        // Очередность сохранена
        // Доступны дубликаты? Да
        // Могу ли я обращаться по индексам? МОГУ
        System.out.println(characters.get(1));
        // Это означает, что я могу и отдельно с каждым элементом поработать
        System.out.println(characters.peekFirst());

        // LinkedList - связанный список
        // Тут главное отличие: каждый элемент как отдельный блок, у него адрес на предыдущий элемент, и на последующий
        // У первого элемента свой собственный адрес и на второй
        // У последнего свой собственный адрес и предыдущий
    }
}