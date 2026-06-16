package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class MyArraysHomework {
    // Поле класса
    public static int[] array = new int[5];

    static void main() {
        /*
        int[] intArray;

        int length;

        do{
            System.out.print("Please enter array length (from 1 to ...): ");

            if ((length = new Scanner(System.in).nextInt()) > 0) break;
        } while(true);

        intArray = new int[length];

        // Random == Math.random()
        for (int index = 0; index < intArray.length; index++){
            intArray[index] = (int) (Math.random() * 100);
        }

        readArrayForwardBackward(intArray);

         */

        readArrayField();

        System.out.println("------------------------------------------------");

        String[] cities = new String[]{"Minsk", "Moscow", "Tbilisi", "Voronezh"};
        int value = 10;

        // Array + integer
        passArrayStringValues(cities, value);

        System.out.println("--------------Call from ORIGINAL main()--------------");
        System.out.println("ORIGINAL: " + value);
        System.out.println(Arrays.toString(cities));

        // В Джаве объекты ВСЕГДА ХРАНЯТСЯ В КУЧЕ (HEAP) - ВСЕГДА!
        // В языках с высокой долей работы напрямую с памятью, объекты могут НЕ ХРАНИТСЯ В КУЧУ (например, С++)
        // int x = 10 -> INTEGER 0x94040ff -> 10 (stack)
        // [] array = array -> 0x1282ff1 -> АДРЕС ПРОСТРАНСТВА В ХИПЕ, ГДЕ ЛЕЖИТ ОБЪЕКТ STACK -> HEAP НЕПОСРЕДСТВЕННО ОБЪЕКТ

        // Передача по значению (pass-by-value) И передача по ссылке (pass-by-reference)

        // int[] 0x556590f4 (cities == cities[0]) == true
            // int[0] 0x556590f4
            // int[1] 0x556590f8
            // int[2] 0x556590f12
            // int[3] 0x556590f16
    }

    public static void declareArrayNoNew(){
        // Каждый объект, имеющий new или подразумевает...
        // String name = "Archil";
        // int[]
        // ПОДРАЗУМЕВАЕТСЯ ! NEW !
        int[] numbers = {12, 1, -6, 1}; // int[] numbers = new int[] {12, 1, -6, 1};
        int[][] doubleNumbers = {{0, 1, 5, -1}, {101}};
    }

    public static void passArrayStringValues(String[] cities, int value){
        System.out.println("Старые данные в параметрах массива и переменной int...");
        for (String city : cities){
            System.out.println("City: " + city);
        }

        System.out.println("Integer value: " + value);

        cities[0] = "Bon Kok";
        cities[1] = "Beijing";
        cities[2] = "Vitebsk";
        cities[3] = "Novgorod";

        value = -1;

        System.out.println("Обновленные данные в параметрах массив и переменной int...");
        for (String city : cities){
            System.out.println("City: " + city);
        }

        System.out.println("Integer value: " + value);
    }

    public static void readArrayField(){
        for(int el : array){
            System.out.println(el);
        }

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        array[0] = array[1];
        array[3] = array[4];

        System.out.println("UPDATED...");

        for(int el : array){
            System.out.println(el);
        }
    }

    public static void readArrayForwardBackward(int[] array){
        System.out.println("Читаю массив в прямом порядке...");

        for(int el : array){
            System.out.println(el);
        }

        System.out.println("Читаю массив в обратном порядке...");

        for(int index = array.length - 1; index >= 0; index--){
            System.out.println(array[index]);
        }

        // min = x; min > array[index] ? min , max = array[index]
        int max;
        int min;
    }

    public static void getMaxMinValue(){
        //
    }
}
