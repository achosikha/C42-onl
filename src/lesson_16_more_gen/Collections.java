package lesson_16_more_gen;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // CODE
        setReadTreeMap();

        // Stack [mainAddress,
        //        useQueue,
        //        priorityQueue,
        //        arrayDeque]

        // STACK RESET [mainAddress, -> DELETE 4 CLOSE PROGRAM
        //              useQueue, -> DELETE 3 Address useQueue
        //              priorityQueue, -> DELETE 2
        //              arrayDeque] -> DELETE 1 (LIFO)

        // LIST - СПИСОК, не уникальный
        // Array - значит расширяемый массив
        // Linked - связанный адресами
        // SET - УНИКАЛЬНЫЕ ЗНАЧЕНИЯ
        // Hash - ТАБЛИЦЫ ИЗ ХЭШОВ (УНИКАЛЬНЫЕ ЧИСЛОВЫЕ ЗНАЧЕНИЯ)
        // Linked (есть адреса), Hash (таблицы с числовыми значения), Set - уникальные
        // Queue - значит FIFO, LIFO
        // Map - Карта, КЛЮЧ - Значение
    }

    public static void getSizeCapacity(){
        // Container - Array, Set, List, Queue, Map
        // Array - length []{10, 11, -1, 0, 0, 0, 0} - 7 * 4 = 28 bytes
        // ArrayList -> new CAPACITY - n-ое количество памяти под контейнер, который может быть заполнен на
        // определенное количество элементов, но вы никогда его НЕ ПЕРЕПОЛНИТЕ
        // То количество памяти, которое уже использовано и называется SIZE()
        // ArrayList[15] {0, -1, 5, 10, 6, 7, 9, null, null, null, null, null, null, null, null}
        // add {0, -1, 5, 10, 6, 7, 9, 0, 15, 21, 5, null, null, null, null}
        // ADD MORE CAPACITY = {0, -1, 5, 10, 6, 7, 9, 0, 15, 21, 5, null, null, null, null} * мин. 1.2
        // New capacity {0, -1, 5, 10, 6, 7, 9, 0, 15, 21, 5, null, null, null, null, null, null, null, null, null, null}
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Archil", "Yulia", "Jack"));
        System.out.println(names);
        HashSet<Integer> digitalValues = new HashSet<>(1000); // HashSet - виделит память мин. на 100 эл
        System.out.println(digitalValues);

        // Можно проверить под капотом CAPACITY
    }

    public static void useQueue(){
        // ОЧЕРЕДЬ
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        System.out.println(priorityQueue.add("Archil"));
        System.out.println(priorityQueue.add("Julia"));
        System.out.println(priorityQueue.add("Johnny"));
        System.out.println(priorityQueue.add("Johnny"));
        System.out.println(priorityQueue.add("Anton"));
        System.out.println(priorityQueue.add("Hermes"));

        arrayDeque.addFirst("Gosha");
        arrayDeque.add("Jennifer");
        arrayDeque.add("Dakota");
        System.out.println(arrayDeque.add("Victoria"));
        System.out.println(arrayDeque.add("Victoria"));
        arrayDeque.add("Archil");

        System.out.println(priorityQueue);
        System.out.println(arrayDeque);

        // Stack - Последний пришел первый ушел
        //
        // First in First Out (FIFO)
        // Очередь - [1, 2, 3, 4, 5]
        // Last in First Out (LIFO)
    }

    public static void useMap(){
        // Словарь: Дом -> House, Собака -> Dog
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Дом", "House");
        hashMap.put("Собака", "Dog");
        hashMap.put("Кошка", "Cat");

        System.out.println(hashMap);

        LinkedHashMap<Integer, Character> letters = new LinkedHashMap<>();
        letters.put(1, 'A');
        letters.put(4, 'A');
        letters.put(3, 'U');
        letters.put(2, 'j');
        letters.put(5, 'L');

        System.out.println(letters);

        TreeMap<String, String> staff = new TreeMap<>();
        staff.put("Sikharulidze", "Java Lecturer");
        staff.put("Kurbatov", "TMC Java Student");
        staff.put("Pivovarov", "TMC Java Student");
        staff.put("Korbut", "TMC Java Student");

        System.out.println(staff);
    }

    public static void setReadTreeMap() {
        TreeMap<String, String> vocabulary = new TreeMap<>();
        vocabulary.put("House", "Дом");
        vocabulary.put("Dog", "Собака");
        vocabulary.put("Horse", "Лошадь");
        vocabulary.put("Mouse", "Мышь");
        vocabulary.put("Scorpion", "Скорпион");

        System.out.println(vocabulary);

        //--------------------------БУДЕТ НА СОБЕСЕДОВАНИИ--------------------------
        // Iterator возможность пройтись по коллекции, как по массиву
        Iterator<String> iterator = vocabulary.keySet().iterator();

        // iterator.hasNext() - он смотрит есть ли в Итераторе следующий ключ
        // iterator.next() - достает этот ключ
        // [House: Дом, Dog: Собака, Flat: Квартира]
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } // САМОСТОЯТЕЛЬНО ПОПРОБОВАТЬ ОТДЕЛЬНО ВЗЯТЬ ВСЕ ЗНАЧЕНИЯ, НЕ КЛЮЧИ
        // -----------------------------БУДЕТ НА СОБЕСЕДОВАНИИ--------------------

        System.out.println("-".repeat(50));
        // Как достать ключи и значения вместе
        // Map.Entry<String, String>
        for (Map.Entry<String, String> entry : vocabulary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("Under the KEY: %s - is a VALUE: %s.\n", key, value);
        }
    }
}
