package lesson_9_abstract_interf.PC.Parts;

import java.util.Arrays;

public class Case {
    private final String caseCompany;
    private final String caseModel;
    private final Boolean isDefaultCooler;
    private final String[] caseIllumination;
    private final int caseProductionYear;

    public Case(String caseCompany, String caseModel, Boolean isDefaultCooler, String[] caseIllumination,
                int caseProductionYear) {
        this.caseCompany = caseCompany;
        this.caseModel = caseModel;
        this.isDefaultCooler = isDefaultCooler;
        this.caseIllumination = caseIllumination;
        this.caseProductionYear = caseProductionYear;
    }

    @Override
    public String toString() {
        return "\n\t\tCompany: " + this.caseCompany +
                "\n\t\tModel: " + this.caseModel +
                "\n\t\tDefault Cooler Installed? " + this.isDefaultCooler +
                "\n\t\tWhat colors illumination includes? " + Arrays.toString(this.caseIllumination) +
                "\n\t\tProduction Year: " + this.caseProductionYear;
    }
}
