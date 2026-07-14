package lesson_10_obj_more_interfaces;

import lesson_10_obj_more_interfaces.clone.Person;
import lesson_10_obj_more_interfaces.controller.*;

public class Main {
    static void main() throws CloneNotSupportedException {
        useClassObject();
    }

    public static void useClassObject(){
        // Class wrapper - обертка класса
        // Ареал использования примитивных типов ограничен
        // Когда нам нужно сослаться на примитивные типы в работе с другими объектами
        // Мы вынуждены использовать ОБЕРТКИ КЛАССА для ПРИМИТИВОВ
        // У каждого примитива есть своя КЛАССОВОЕ ПРЕДСТАВЛЕНИЕ:
            // Number
                // short - Short
                // byte - Byte
                // int - Integer
                // double - Double
                // float - Float
            // char - Character
            // boolean - Boolean
        ClassObject object = new ClassObject("ClassObject", "Package");
        System.out.println(object.getClass().getCanonicalName());
        System.out.println(object.getClass().getName());

        // DEPRECATED? Какой-то функционал существует, что компилятор знает, что его ПОДДЕРЖКА и РАЗВИТИЕ
        // ПРИОСТАНОВЛЕНО. Созданы новые механизмы, которые заменили этот функционал

        // У каждого объекта есть УНИКАЛЬНОЕ ЧИСЛОВОЕ ЗНАЧЕНИЕ - это ХЭШКОД - int
        // equals() vs. hashCode
        System.out.println("object hash code: " + object.hashCode());
        System.out.println("apple".equals("tomato"));
        System.out.println(128188191 > 19187711);

        System.out.println("-".repeat(100));

        // ХЭШКОДА есть интересные моменты: не всегда объекты имеют разные хэшкоды
        Object[] objects = new Object[]{
                1566,
                "Archil",
                true,
                'A',
                145.4,
                new ClassObject("Class Object", "Package"),
                new int[] {1, 4, 10, 0}
        };

        for(Object obj : objects){
            System.out.println(obj);
        }

        // Male & Female
        // Object -> instanceof
        System.out.println(object instanceof ClassObject);
        System.out.println(object instanceof Object);
    }

    public static void createClosedObject(){
        // ClosedObject closedObject = new ClosedObject();
    }

    public static void createAndClonePerson() throws CloneNotSupportedException {
        Person archil = new Person("Archil", "Sikharulidze", 37);

        // instanceof
        Person ivan = (Person) archil.clone();
        Person katya = archil; // alias значит другое наименование одного и того же объекта

        // SHALLOW COPY - DEEP COPY
        System.out.println(archil);
        System.out.println(ivan);
        System.out.println("I have changed age!");
        ivan.setAge(25);
        System.out.println(archil);
        System.out.println(ivan);
    }

    public static void createController(){
        Controller tvRemove =
                new ControllerSamsung("Samsung", "R-9A", 2012);
        tvRemove.initiate();
        tvRemove.makeRemoteCall();
        tvRemove.initiateDefaultParameters();

        System.out.println("-".repeat(80));

        Controller tvRemoteSony =
                new ControllerSony("Sony", "Si-1", 2022);
        tvRemoteSony.initiateDefaultParameters();

        // Interface.CONSTANT;
        System.out.println(tvRemoteSony.getMsg());
    }
}