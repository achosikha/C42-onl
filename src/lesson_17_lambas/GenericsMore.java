package lesson_17_lambas;

import java.util.*;

public class GenericsMore {
    public static void main(String[] args){
        // HashSet
        // LinkedHashSet
        // TreeSet
        TreeSet<String> names = new TreeSet<>();
        names.add("Archil");
        names.add("Vladimir");
        names.add("Kristina");
        names.add("Yulia");
        System.out.println(names);

        // names.addFirst("Julieta");
        // names.addLast("Johnny");

        callGenerics();
        createLinkedHashSetCapacity();
        checkVectorCapacity();
        System.out.println("-".repeat(50));
        useWildCardExtends();
    }

    public static void useWildCardExtends(){
        BasicGenerics<Integer, String> general = new BasicGenerics<>(12, "JK");
        GenericNumbers<Byte> byteGeneric = new GenericNumbers<>((byte)127);
        GenericNumbers<Short> shortGeneric = new GenericNumbers<>((short)127);
        GenericNumbers<Integer> intGeneric = new GenericNumbers<>(127);
        GenericNumbers<Long> longGeneric = new GenericNumbers<>(127L);
        GenericNumbers<Double> doubleGeneric = new GenericNumbers<>(127D);

        System.out.println(byteGeneric);
        System.out.println(longGeneric);

        // GenericNumbers<String> stringGeneric = new GenericNumbers<String>();

        BlockedGeneric<Integer, String> keyValueGeneric = new BlockedGeneric<>(1, "Home");
        System.out.println(keyValueGeneric);

        // BlockedGeneric<Double, String> doubleValueGeneric;
        // BlockedGeneric<Long, String> longValueGeneric;

        // Integer - сам не является никакой группой, это просто реализация примитивного типа
        // BlockedGeneric<Short, String>
    }

    public static void checkVectorCapacity(){
        // Example, default capacity set
        ArrayList<Double> doubleDigits = new ArrayList<>(200000);


        Vector<Integer> numbers = new Vector<>(1000);
        System.out.println(numbers.capacity());

        for(int index = 0; index < 999; index++){
            numbers.add(index);
        }

        System.out.println(numbers);
        System.out.println(numbers.capacity());

        numbers.add(1819);
        System.out.println(numbers);
        System.out.println(numbers.capacity());
        numbers.add(-111);
        System.out.println(numbers);
        System.out.println(numbers.capacity());
    }

    public static void createLinkedHashSetCapacity(){
        // size() - размер
        // capacity()

        // Я заранее задам ему уже 1000 элементов - CAPACITY для того, чтобы не пришлось постоянно менять размер
        // объекта, расширять его
        // Что будет если я доберусь до объема до capacity? Вы никогда до него не доберетесь !!!
        // Если у вас автоматически выделено память под 1000 элементов, как только вы заполните приблизительно 3/4
        // Он сам расшириться автоматически от уже существующего объема * 1,2 (Vector * 2)
        LinkedHashSet<String> names = new LinkedHashSet<>(List.of("JK", "LK", "NB", "UR", "PO"));
        System.out.println(names.size());
    }

    public static void callGenerics(){
        BasicGenerics<String, String> word = new BasicGenerics<>("Gold", "Золото");
        System.out.println(word);

        GenericsExtended<String, String> vocabulary = new GenericsExtended<>(
                new String[]{"House", "Dog", "Cat", "Apple", "Wine", "Flat"},
                new String[]{"Дом", "Собака", "Кошка", "Яблоко", "Вино", "Квартира"}
        );

        System.out.println(vocabulary);
    }
}
