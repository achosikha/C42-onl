package lesson_19_opt_stream_more;

// record - это класс, который только хранит данные
// у него минимальное количество методов
// только базовые - гет, сет, тоСтринг
public record Animal(String type, String name, int age) {
    public Animal(){
        this("Unknown", "Unknown", 0);
    }
}