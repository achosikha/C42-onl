package lesson_9_abstract_interf;

import lesson_9_abstract_interf.PC.MyComputer;
import lesson_9_abstract_interf.PC.Parts.*;
import lesson_9_abstract_interf.PC.Variations.PCAdvanced;
import lesson_9_abstract_interf.cars.*;
import lesson_9_abstract_interf.deepInherit.ATM;
import lesson_9_abstract_interf.deepInherit.ATMMore;
import lesson_9_abstract_interf.deepInherit.ATMMoreAdvanced;

public class MyMain {
    static void main() {
        createCars();
    }

    public static void createCars(){
        Car[] cars = new Car[]{
                new Jeep("Jeep", 220, 2015),
                new Mercedes("Mercedes", 260, 2010),
                new OpelVectra("Opel Vectra", 180, 2004),
                new OpelAstra("Opel Astra", 190, 2010)
        };

        for(Car car : cars){
            System.out.println(car);
            car.startEngine();
            car.stopEngine();
        }
    }

    public static void createATM(){
        // ATM atm = new ATMMore()
        ATM atm = new ATM("BOG", 2019811, "Archil Sikharulidze");
        ATM atmMore = new ATMMore("TBC", 28291, "German");
        ATM atmMoreAdvanced = new ATMMoreAdvanced("RICO", 29291, "Yulia");

        System.out.println(atm.getCredentials());
        System.out.println(atmMore.getAtm());
        System.out.println(atmMoreAdvanced.getAccount());

        System.out.println("-".repeat(50));
        ATMMore moreATM = new ATMMore("TBC", 28291, "German");
        ATMMore moreAdvanced = new ATMMoreAdvanced("RICO", 29291, "Yulia");

        moreATM.getInternalMSG();

        System.out.println("-".repeat(50));

        ATMMoreAdvanced advancedFunctions = new ATMMoreAdvanced("RICO", 29291, "Yulia");
        System.out.println(advancedFunctions.getHiddenNumber());
    }

    public static void createPC(){
        MyComputer pci9 = new MyComputer();
        System.out.println(pci9);

        System.out.println("-".repeat(50));

        MyComputer pci9CPU = new MyComputer(new CPU("Samsung", "i9",
                4, 2, 2022));
        System.out.println(pci9CPU);

        System.out.println("-".repeat(50));

        MyComputer pci9FULL = new MyComputer(
                new CPU("Samsung", "i9", 4, 2, 2022),
                new Case("Jeepstick", "JK-1L", true, new String[]{"White, Red, Blue"},
                        2019),
                new Baseboard("Huawei", "JK-B-1", new String[]{"VGA", "Audio", "HDMI-F"},
                        10, 2024),
                new Cooler("Neet", "Cool Net", 545, 56, 2026),
                new HDD("Seagate", "S900", 5, 4000, 2022),
                new RAM("SppD", "SSD-1", "DDR5", 32, 2025));
        System.out.println(pci9FULL);
    }

    public static void createAdvancedPC(){
        MyComputer advancedCi9 = new PCAdvanced(); // ЧТОБЫ Я МОГ ДАТЬ ЕМУ ТУТ ПЯТЬ ПАРАМЕТРОВ?
        System.out.println(advancedCi9);
    }
}