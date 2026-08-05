package lesson_16_more_gen;

public class GenericMap <K, V>{
    // MAP Key - Value
    K key;
    V value;

    GenericMap(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + this.key + "\n" + "Value: " + this.value;
    }
}
