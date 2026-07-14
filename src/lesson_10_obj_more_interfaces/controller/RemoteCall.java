package lesson_10_obj_more_interfaces.controller;

// public не нужен интерфейсу, все интерфейсы автоматически public
public interface RemoteCall {
    // Все переменные в интерфейсе априори являются КОНСТАНТАМИ
    // Т.е. их значение final
    // Все переменные едины для классов, т.е. они уже static
    String MSG = "Welcome to Remote Call Interface.";
    int DEFAULT_CODE = 4561;
    // Классические правила интерфейса
        // Базовая разница - Интерфейс говорит что, но не как - в классе АБСТРАКТНЫЙ МЕТОД
        // По глобальной идее, КЛАСС ХРАНИТ ДАННЫЕ, ИНТЕРФЕЙС ТОЛЬКО ОПИСАНИЕ ЧТО
    // Указание доступа для методов нужно лишь в том случае, если вы ОБЪЯВЛЯЕТЕ МЕТОД ЗАКРЫТЫМ
    // В неклассической реализации Интерфейс может иметь закрытые методы, статические методы, нестатические методы и т.д.
    // До изменений, все в Интерфейсе было public
    // Interface уже АБСТРАКТНЫЙ нельзя создать свой собственный экземпляр
    void makeRemoteCall();

    // Метод, который может быть переопределен
    // Но он не везде нужен. Чтобы просто не давать везде его пустую реализация
    // Создадим метод с дефолтным телом
    default void initiateDefaultParameters(){
        // SOME DEFAULT CODE
        System.out.println("This METHOD has default implementation. Called from RemoteCall interface.");
    }

    default String getMsg(){
        return MSG;
    }
}