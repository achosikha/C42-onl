package lesson_8_polym_static;

public class Car {
    // final - когда дело касается переменных - запрещает менять их значения (Java вариант ключевого слова const)
    private final String carBrand;
    private final String carModel;
    private final int carProductionYear;
    private long carMiles;
    private final int carMaxSpeed;
    private final int carMinSpeed;
    private static int carCounter;

    public Car(String carBrand, String carModel, int carProductionYear,
               long carMiles, int carMaxSpeed, int carMinSpeed){
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carProductionYear = carProductionYear;
        this.carMiles = carMiles;
        this.carMaxSpeed = carMaxSpeed;
        this.carMinSpeed = carMinSpeed;
        carCounter++;
    }

    // Это метод, который ДОЛЖЕН БЫТЬ У ВСЕХ ОДИНАКОВЫМ
    // В ТОМ ЧИСЛЕ, У КЛАССОВ, КОТОРЫЕ БУДУТ ОТ НЕГО НАСЛЕДОВАТЬСЯ
    // Мне нужен механизм запрета на переопределения этого метода
    // Для этого я использую опять ключевое слово final
    // Если использовать final с методом - это запрет на ПЕРЕОПРЕДЕЛЕНИЕ
    public final void getSuperInfo(){
        System.out.println("Это базовый метод для всех классов. ВЫЗОВ И СУПЕР КЛАССА CAR.");
    }

    public static int getCarCounter() {
        return carCounter;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "\tBrand: " + this.carBrand +
                "\n\tModel: " + this.carModel +
                "\n\tProduction Year: " + this.carProductionYear +
                "\n\tMiles: " + this.carMiles +
                "\n\tMax Speed: " + this.carMaxSpeed +
                "\n\tMin Speed: " + this.carMinSpeed;
    }
}
