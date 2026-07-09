package lesson_9_abstract_interf.PC.Parts;

public class RAM {
    private final String ramCompany;
    private final String ramModel;
    private final String ramType;
    private final int ramCapacity;
    private final int ramProductionYear;

    public RAM(String ramCompany, String ramModel, String ramType, int ramCapacity, int ramProductionYear) {
        this.ramCompany = ramCompany;
        this.ramModel = ramModel;
        this.ramType = ramType;
        this.ramCapacity = ramCapacity;
        this.ramProductionYear = ramProductionYear;
    }

    @Override
    public String toString() {
        return "\n\t\tCompany: " + this.ramCompany +
                "\n\t\tModel: " + this.ramModel +
                "\n\t\tType: " + this.ramType +
                "\n\t\tCapacity: " + this.ramCapacity + " GB" +
                "\n\t\tProduction Year: " + this.ramProductionYear;
    }
}
