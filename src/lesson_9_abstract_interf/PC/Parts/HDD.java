package lesson_9_abstract_interf.PC.Parts;

public class HDD {
    private final String hddCompany;
    private final String hddModel;
    private final long hddCapacity;
    private final double hddSpeedExchange;
    private final int hddProductionYear;

    public HDD(String hddCompany, String hddModel, long hddCapacity, double hddSpeedExchange, int hddProductionYear) {
        this.hddCompany = hddCompany;
        this.hddModel = hddModel;
        this.hddCapacity = hddCapacity;
        this.hddSpeedExchange = hddSpeedExchange;
        this.hddProductionYear = hddProductionYear;
    }

    @Override
    public String toString() {
        return "\n\t\tCompany: " + this.hddCompany +
                "\n\t\tModel: " + this.hddModel +
                "\n\t\tCapacity: " + this.hddCapacity + " GB" +
                "\n\t\tSpeed Exchange: " + this.hddSpeedExchange + " MBs" +
                "\n\t\tProduction Year: " + this.hddProductionYear;
    }
}
