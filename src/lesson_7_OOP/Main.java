package lesson_7_OOP;

import lesson_7_OOP.animal.Animal;
import lesson_7_OOP.animal.Lion;
import lesson_7_OOP.animal.Wolf;
import lesson_7_OOP.shop.MyShop;

public class Main {
    static void main() {
        // Encapsulation - инкапсуляция или самым простым языком - СКРЫТИЕ ДАННЫХ
            // Access modifier - модификаторы доступа, решают что внешние объекты могут узнать о внутренности,
            // а что должно быть скрыто.
            // public - ВСЕ ВСЕМ ВИДНО и ДОСТУПНО
            // private - ВИДНО ТОЛЬКО ВНУТРИ ОБЪЕКТА, НИКТО ИЗВНЕ НЕ ИМЕЕТ ДОСТУП К ПАРАМЕТРАМ И СВОЙСТВАМ
            // protected - ДОСТУПНО ПРИ НАСЛЕДОВАНИИ
            // package-private - default подход, уровень доступа ПАКЕТ, т.е. видно все всем, которые лежат в
            // одном пакете
        // Inheritance - Наследование, объекты перенимают друг у друга свойства и поведение
        // Polymorphism - ОДИН ИНТЕРФЕЙС, МНОЖЕСТВЕННАЯ РЕАЛИЗАЦИЯ
        createAnimal();
    }

    public static void createAnimal(){
        Animal animal = new Animal("Lion", "John", "Yellow", 3, 86);
        System.out.println(animal);

        Animal lion = new Lion("Lion", "Foobs", "Yellow", 1, 67);
        Animal wolf = new Wolf("Wolf", "Jack", "Grey", 2, 70);
        System.out.println(lion);
        System.out.println("-".repeat(50));
        System.out.println(wolf);
        wolf.roars();
        wolf.run();
        lion.roars();
        lion.run();
    }

    public static void createShop(){
        MyShop apple = new MyShop();
        System.out.println(apple.getStoreInformation());
        // Первое правило инкапсуляции - ПОЛЯ КЛАССА ДРУГОГО ОБЪЕКТА ВСЕГДА ДОЛЖНЫ БЫТЬ СКРЫТЫ ДЛЯ ДРУГИХ ОБЪЕКТОВ
        // Исключения: НАСЛЕДОВАНИЕ (ограниченное), второе - надобность доступа на уровне ПАКЕТА (РЕДКО)

        MyShop android = new MyShop("Android", "11, Camel Street, Chicago", 5_139_11L);
        System.out.println(android.getStoreInformation());
        MyShop huawei = new MyShop(
                "Huawei",
                "1, Beijing, China",
                new String[]{"Archil Sikharulidze", "Jennifer Connely", "Sam Witkoff"},
                3,
                new String[]{"Pudding", "Bread", "Garlic"},
                1789L,
                2_455_1L
        );
        System.out.println(huawei.getStoreInformation());

        System.out.println("Staff number: " + huawei.getStaffNumber());
        System.out.println("What is store budget? " + huawei.getStoreBudget());
        System.out.println("Set staff wage!");
        huawei.setStaffWage(781L);
        System.out.println("What is wage amount? " + huawei.getStaffWage());
        System.out.println("Let's change STORE' name.");
        huawei.setStoreName("Huawei Android");
        System.out.println("Get updated store name: " + huawei.getStoreName());

        // Object.toString() - дает адрес объекта
        System.out.println(huawei);
    }
}
