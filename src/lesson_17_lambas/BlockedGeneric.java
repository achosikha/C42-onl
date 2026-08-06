package lesson_17_lambas;

public class BlockedGeneric <K extends Integer, V extends String>{
    // Все мой ключи должны быть целочисленными значения int
    // Все мой значения должны быть строками String
    K key;
    V value;

    public BlockedGeneric(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.key + " --> " + this.value;
    }
}
