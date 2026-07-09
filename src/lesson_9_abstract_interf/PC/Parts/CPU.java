package lesson_9_abstract_interf.PC.Parts;

public class CPU {
    private final String cpuCompany;
    private final String cpuModel;
    private final int cpuCores;
    private final int cpuSpeed;
    private final int cpuProductionYear;

    public CPU(String cpuCompany, String cpuModel, int cpuCores, int cpuSpeed, int cpuProductionYear) {
        this.cpuCompany = cpuCompany;
        this.cpuModel = cpuModel;
        this.cpuCores = cpuCores;
        this.cpuSpeed = cpuSpeed;
        this.cpuProductionYear = cpuProductionYear;
    }

    @Override
    public String toString() {
        return "\n\t\tCompany: " + this.cpuCompany +
                "\n\t\tModel: " + this.cpuModel +
                "\n\t\tCores: " + this.cpuCores +
                "\n\t\tSpeed: " + this.cpuSpeed + " hz" +
                "\n\t\tProduction Year: " + this.cpuProductionYear;
    }
}
