package lesson_16_more_gen;

import java.util.*;

public class MyCollections {
    public static void main(String[] args){
        // Call method
        useSet();

        // BIG O Notation - это формула потраченного времени на операцию
    }

    public static void useSet(){
        // HashSet - не сохраняет последовательность элементов
        // Он их разбрасывает по ХэшКодам
        // У каждого элемента будет свой уникальный код и
        // в списке будет поставлен исходя из собственной логики
        HashSet<Integer> hashSet = new HashSet<>(List.of(1, -5, 10, 11, -11, 125, 0, 0));
        HashSet<String> hasSetNames = new HashSet<>(
                List.of("Jennifer", "Katya", "Gerry", "Leyla"));

        System.out.println("HashSet: " + hashSet);
        System.out.println("HashSet names: " + hasSetNames);

        for(int element : hashSet){
            System.out.println(element);
        }

        System.out.println(hashSet.add(109));
        System.out.println(hashSet.add(-2));
        System.out.println(hashSet.add(-2));

        System.out.println(hashSet);
        System.out.println("-".repeat(50));
        LinkedHashSet<Integer> linkedHashSet =
                new LinkedHashSet<>(List.of(1, -5, 10, 11, -11, 125, 0, 0));
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.add(108);
        linkedHashSet.add(-9);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        System.out.println("-".repeat(50));
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1, -5, 10, 11, -11, 125, 0, 0));
        System.out.println("TreeSet: " + treeSet);
        treeSet.add(-19);

        // Почему попытка так добавить выводит ОШИБКУ???
        // treeSet.addLast(-22);
        // treeSet.addFirst(1);

        System.out.println("TreeSet: " + treeSet);
    }

    public static void callArrayList(){
        // Расширяемый
        ArrayList<String> arrayList = new ArrayList<>(
                List.of("Archil", "Timur", "Nadya", "Ivan"));
        System.out.println(arrayList);
    }

    public static void callLinkedList(){
        LinkedList<String> linkedList = new LinkedList<String>(
                List.of("Ksenya", "Indira", "Katya", "Vova"));
        System.out.println(linkedList);
    }

    // Program: Telephone -> main() -> int x = 10, int y = 100, calculate(x, y) ->
    // calculate() - int sum = x + y
    // First In Last Out - FILO
    // STACK [      calculate() - int sum (у него свой собственный стэк)
    //            calculate() - ADDRESS main()
    //         int y
    //         int x
    //         main()]

    // calculate() int sum ВЫПОЛНИЛОСЬ
    // STACK [calcualte(),
    //  int y
    //  int x
    // main()]

    // calculate() DONE
    // STACK [int y
    //        int x
    //        main()

    // int y, int y
    // STACK [main()]
    // DONE main()
    // STACK []
}
