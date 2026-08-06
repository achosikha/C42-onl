package lesson_17_lambas;

import java.util.Arrays;

public class GenericsExtended <K, V>{
    private K[] keys;
    private V[] values;

    public GenericsExtended(long capacity){
        // ПОПЫТАТЬСЯ СДЕЛАТЬ ТАК, ЧТОБЫ Я МОГ СОЗДАТЬ Н-количество элементов массива
        // Ключ - Значение
    }

    public GenericsExtended(K[] keys, V[] values){
        this.keys = keys;
        this.values = values;
    }

    @Override
    public String toString() {
        return "Keys: " + Arrays.toString(keys) + "\n" + "Values: " + Arrays.toString(values);
    }
}
