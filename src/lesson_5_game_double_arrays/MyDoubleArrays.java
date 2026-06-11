package lesson_5_game_double_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyDoubleArrays {
    public static void main(String[] args){
        // Двумерные массивы
        // Трехмерные массивы
        initiateArrayTask();
    }

    public static void initiateArrayTask(){
        System.out.print("Please enter number of rows: ");
        int rows = new Scanner(System.in).nextInt();
        System.out.print("Please enter number of columns: ");
        int cols = new Scanner(System.in).nextInt();

        createDynamicArray(rows, cols);
    }

    // Создайте массив с Н количеством рядом и Н количеством столбцов
    // Пусть в метод передадут эти данные, а потом
    // Из метода вызовите другой метод, который прочитает значения
    public static void createDynamicArray(int rows, int cols){
        int[][] table = new int[rows][cols];

        for(int row = 0; row < table.length; row++){
            for(int col = 0; col < table[row].length; col++){
                table[row][col] = new Random().nextInt(0, 21);
            }
        }

        readTwoDimensionalArray(table);
    }

    // Сигнатура метода - это ЕГО НАИМЕНОВАНИЕ + ПАРАМЕТРЫ В ТОЙ ОЧЕРЕДНОСТИ, КОТОРЫЕ ДАННЫ
    public static void useTwoDimensionalArray(){
        // СОЗДАЙ ДвухМерный массив с Х количеством СТРОЧЕК и У количеством СТОЛБЦОВ
        int[][] table;
        table = new int[3][];

        int[][] tableUpdated;
        tableUpdated = new int [3][3];

        // int[][] table = 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[][] tableFull = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10},
                {19, 11, 12, 14}
        };

        readTwoDimensionalArray(tableFull);
        System.out.println("-".repeat(50));

        // Создал анонимный трехмерный массив
        // Анонимный значит НЕТ ПОСТОЯННОГО ИМЕНИ
        useThreeDimensionalArray(new String[][][]{
                {
                        {"Archil", "Ylia"},
                        {"Vasya", "Nadezda", "Ivan"}
                },
                {
                        {"Valentina"},
                        {"Johnny", "Jack"},
                        {"Bill", "Helena", "Paris"}
                }
        });
    }

    public static void readTwoDimensionalArray(int[][] table){
        for(int[] row : table){ // Возьми из двухмерного массива table, одномерный массив int[] row
            for(int col : row){ // Из одномерного массива int[] row поэтапно возьми каждый элемент и сохрани в int col
                System.out.print(col + "\t"); //
            }
            System.out.println();
        }
        /*
        for(int row = 0; row < table.length; row++){ // общая длина двухмерного массива равна количество СТРОК
            for(int col = 0; col < table[row].length; col++){ // Но у каждой СТРОКИ СВОЕ КОЛИЧЕСТВО СТОЛБЦОВ
                // Поэтому надо указать не просто длину таблица, а длину определенной строки
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
         */
    }

    // Трехмерный массив - это 3Д КУБ
    public static void useThreeDimensionalArray(String[][][] names){
        for(String[][] outer : names){
            for(String[] rows : outer){
                for (String cols : rows){
                    System.out.print(cols + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        /*
        for(int outer = 0; outer < names.length; outer++){
            for(int rows = 0; rows < names[outer].length; rows++){
                for(int cols = 0; cols < names[outer][rows].length; cols++){
                    System.out.print(names[outer][rows][cols] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
         */
    }

    public static void useArrayMethods(){
        // method - название deep значит читает более сложные конструкции, например, двойной массив
        // Arrays.toString(new int[][] {{1, 2, 3, 4, 5}, {1}, {4, -1, 2}, {-1, 0, 0, }})) - адреса массивов
        System.out.println(Arrays.deepToString(new int[][] {{1, 2, 3, 4, 5}, {1}, {4, -1, 2}, {-1, 0, 0, }}));
    }
}
