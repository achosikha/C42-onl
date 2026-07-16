package homework_9.Job;

public interface Profession {
    String getProfession();

    default void getSalary(){
        System.out.println("Получить зарплату");
    }
}
