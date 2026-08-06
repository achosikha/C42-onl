package lesson_17_lambas;

import java.util.*;

public class MapCollection {
    public static void main(String[] args){
        // Call MAP
        readTreeMap();
    }

    public static void readTreeMap(){
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

        // Map<K, V> - entry - Key - Value
        for (Map.Entry<String, String> entry : vocabulary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("Under the KEY: %s - is a VALUE: %s.\n", key, value);
        }
    }

    public static void createMap(){
        HashMap<Integer, Character> hashMap = new HashMap<>();
        System.out.println(hashMap.put(1, 'A'));
        System.out.println(hashMap.put(9, 'C'));
        System.out.println(hashMap.put(-1, 'O'));
        System.out.println(hashMap.put(0, 'J'));
        System.out.println(hashMap.put(0, 'K'));
        System.out.println(hashMap.put(-11, '&'));

        System.out.println(hashMap);

        LinkedHashMap<Integer, Character> linkedHashMap = new LinkedHashMap<>();

        for(int index = 1, letter = 65; index < 27; index++, letter++){
            linkedHashMap.put(index, (char)letter);
        }

        System.out.println(linkedHashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(-1, "Archil");
        treeMap.put(9, "Vova");
        treeMap.put(0, "Katya");
        treeMap.put(-11, "Zhenya");

        System.out.println(treeMap);

        System.out.println("If there is a key: " + treeMap.get(9));
        System.out.println("If there is no such key: " + treeMap.get(1));
    }
}
