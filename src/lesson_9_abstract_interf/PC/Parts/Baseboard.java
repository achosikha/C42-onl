package lesson_9_abstract_interf.PC.Parts;

import java.util.Arrays;

public class Baseboard {
    private final String baseboardCompany;
    private final String baseboardModel;
    private final String[] baseboardSockets;
    private final int baseboardSocketsNumber;
    private final int baseboardProductionYear;

    public Baseboard(String baseboardCompany, String baseboardModel, String[] baseboardSockets,
                     int baseboardSocketsNumber, int baseboardProductionYear) {
        this.baseboardCompany = baseboardCompany;
        this.baseboardModel = baseboardModel;
        this.baseboardSockets = baseboardSockets;
        this.baseboardSocketsNumber = baseboardSocketsNumber;
        this.baseboardProductionYear = baseboardProductionYear;
    }

    @Override
    public String toString() {
        return "\n\t\tCompany: " + this.baseboardCompany +
                "\n\t\tModel:" + this.baseboardModel +
                "\n\t\tSockets: " + Arrays.toString(this.baseboardSockets) +
                "\n\t\tSockets Number: " + this.baseboardSocketsNumber +
                "\n\t\tProduction Year: " + this.baseboardProductionYear;
    }
}
