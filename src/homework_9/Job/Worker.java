package homework_9.Job;

public class Worker extends Staff implements Profession{
    public Worker(String name, String surname) {
        super(name, surname, "Worker");
    }

    @Override
    public String getProfession() {
        // take profession as variable
        return "Я простой рабочий!";
    }

    @Override
    public void getSalary() {
        System.out.println("Что такой зарплата?");
    }
}