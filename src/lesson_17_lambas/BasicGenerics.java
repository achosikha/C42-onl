package lesson_17_lambas;

// Обобщенный контейнер
public class BasicGenerics <K, V>{
    K key;
    V value;

    public BasicGenerics(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key => " + this.key + " = Value => " + this.value;
    }
}
