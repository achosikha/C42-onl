package lesson_8_polym_static;

// Я хочу запретить НАСЛЕДОВАНИЕ от КЛАССА OPEL
// Опять final - запрещает наследоваться от класса
public final class Opel extends Car{
    public Opel(String carBrand, String carModel, int carProductionYear, long carMiles, int carMaxSpeed, int carMinSpeed) {
        super(carBrand, carModel, carProductionYear, carMiles, carMaxSpeed, carMinSpeed);
    }
}
