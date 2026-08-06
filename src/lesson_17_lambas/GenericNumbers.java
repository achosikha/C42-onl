package lesson_17_lambas;

// Пожалуйста, прими только ЧИСЛОВЫЕ ЗНАЧЕНИЯ
// Wildcard - super что-то и выше
// Wildcard - extends принимает и расширяет
// Wildcard - ? я не знаю что именно

// extends - все что указанный КЛАСС и НИЖЕ, но не ВЫШЕ, и не что-то другое
public class GenericNumbers <T extends Number>{
    T type;

    public GenericNumbers(T type){
        this.type = type;
    }

    @Override
    public String toString() {
        return String.valueOf(this.type);
    }
}
