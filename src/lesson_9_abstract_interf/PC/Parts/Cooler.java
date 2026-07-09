package lesson_9_abstract_interf.PC.Parts;

import java.util.Arrays;

public class Cooler {
    private final String coolerCompany;
    private final String coolerModel;
    private final int coolerSpeed;
    private final int coolerSound;
    private final int coolerProductionYear;

    public Cooler(String coolerCompany, String coolerModel, int coolerSpeed,
                  int coolerSound, int coolerProductionYear1) {
        this.coolerCompany = coolerCompany;
        this.coolerModel = coolerModel;
        this.coolerSpeed = coolerSpeed;
        this.coolerSound = coolerSound;
        this.coolerProductionYear = coolerProductionYear1;
    }

    @Override
    public String toString() {
        return "\n\t\tCompany: " + this.coolerCompany +
                "\n\t\tModel: " + this.coolerModel +
                "\n\t\tSpeed: " + this.coolerSpeed +
                "\n\t\tSound: " + this.coolerSound + " db" +
                "\n\t\tProduction Year: " + this.coolerProductionYear;
    }
}
