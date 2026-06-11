package lesson_5_game_double_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysBasic {
    public static void main() {
        // Arrays
        // Arrays.()
        setArrayLength();
    }

    public static void setArrayLength(){
        // У меня массив из Н-количества элементов
        // Можно ли изменить длину массива?
        // Если я хочу изменить длину массива и добавить туда Н-количество элементов, как это можно сделать?

        // Создать массив из Н-количество
        // Прописать туда значения - по своему усмотрению с клавиатуры
        // После этого, увеличить этот массив опять на Н-количество элементов
            // Надо создать новый массив на основе старого, передать туда все значения, и в начале же
            // новому массиву указать новую длину
        int[] digits = new int[10];

        // В Джаве есть специальный класс - Random
        // Math
        Random input = new Random();

        for (int index = 0; index < digits.length; index++){
            digits[index] = input.nextInt(1, 11);
        }

        // class Math -> round(), floor(), random()
        // 12.11112 >= 12.11111
        // 23.4145.round() -> Math.floor(value)
        double randomMathDigit = Math.random(); // int randomNum = min + (int)(Math.random() * ((max - min) + 1));

        System.out.println(Arrays.toString(digits));

        // int[] - из старых 10 элементов + новые 5
        int[] digitsExtended = new int[digits.length + 7];

        // Откуда куда?
        // С какого элемента по какой?
        // И с какого индекса по какой?
        // Скопировать все элементы из digits в новый массив с того индекса на какое количество элементов было
        // добавлено
        for(int index = 0; index < digits.length; index++){
            // Старый массив 0 - 9
            // Новый массив 0 - по НОВОЕ ЗНАЧЕНИЕ
            // С какого элемента в НОВОМ массиве я должен пробрасывать?
            digitsExtended[index] = digits[index];
        }

        System.out.println(Arrays.toString(digitsExtended));

        Arrays.fill(digitsExtended, 0);

        for(int index = 0, indexExtended = digitsExtended.length - digits.length;
            index < digits.length; index++, indexExtended++) {
            // Старый массив 0 - 9
            // Новый массив 0 - по НОВОЕ ЗНАЧЕНИЕ
            // С какого элемента в НОВОМ массиве я должен пробрасывать?
            digitsExtended[indexExtended] = digits[index];
        }

        System.out.println(Arrays.toString(digitsExtended));

        Arrays.fill(digitsExtended, 0);
        System.arraycopy(digits, 0, digitsExtended, digitsExtended.length - digits.length, digits.length);
        System.out.println(Arrays.toString(digitsExtended));
    }
}
