package homework_9.Job;

public class Accountant extends Staff implements Profession {
    public Accountant(String name, String surname) {
        super(name, surname, "Accountant");
    }

    @Override
    public String getProfession() {
        return "Бухгалтер милый мой бухгалтер";
    }
}