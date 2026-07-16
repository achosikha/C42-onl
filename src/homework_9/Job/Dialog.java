package homework_9.Job;

public class Dialog {
    public static void getInformation(Profession p){
        System.out.println("-".repeat(60));
        System.out.println("Какая твоя должность?");
        p.getProfession();
        System.out.println("Сегодня день зарплаты)");
        p.getSalary();
    }

    public static void getDialog(){
        Director director = new Director("Vasily", "Ivanov");
        Accountant accountant = new Accountant("Katya", "Shapiro");
        Worker worker = new Worker("Zhenya", "Dovidenko");
        getInformation(director);
        getInformation(accountant);
        getInformation(worker);
    }
}
