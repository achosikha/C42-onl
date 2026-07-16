package homework_9.Job;

public class Director extends Staff implements Profession{
    public Director(String name, String surname) {
        super(name, surname, "Director");
    }

    @Override
    public String getProfession() {
        return "Я есть директор!";
    }
}