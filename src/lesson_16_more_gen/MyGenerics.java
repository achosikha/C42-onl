package lesson_16_more_gen;

// T type
// Просто название переменной позволяет хранить ВСЕ
public class MyGenerics <T>{
    T t;

    MyGenerics(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return String.valueOf(t);
    }
}
