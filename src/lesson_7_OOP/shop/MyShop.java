package lesson_7_OOP.shop;

// Для того, чтобы вставить в рабочий класс какой-то пакет или один, несколько файлов нужно использовать
// ключевое слово import + название пакета.Класс;
// Если нужно вставить весь пакет после названия пакета.*;
// * - ОБЫЧНО ОЗНАЧАЕТ - ВСЕ.
import java.util.Arrays;

public class MyShop {
    private String storeName;
    private String storeAddress;
    private int staffNumber;
    private String[] staffMembers;
    private String[] storeProduct;
    private long staffWage;
    private long storeBudget;

    // конструктор специальный МЕТОД который дает возможность создать экземпляр класса с автоматический
    // заводскими настройками.
    public MyShop(){
    }

    public MyShop(String storeName, String storeAddress, long storeBudget){
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeBudget = storeBudget;
    }

    public MyShop(String storeName, String storeAddress, String[] staffMembers, int staffNumber,
                  String[] storeProduct, long staffWage, long storeBudget){
        this.storeName = storeName; // this -> это ссылка объекта на самого себя или ПРОСТО ЕГО АДРЕС в памяти
        this.storeAddress = storeAddress;
        this.staffNumber = staffNumber;
        this.staffMembers = staffMembers;
        this.storeProduct = storeProduct;
        this.staffWage = staffWage;
        this.storeBudget = storeBudget;
    }

    // getter & setter
    // Если нужно задать значение полю класса - создаем setter
    // Если нужно достать значение поля класса - создаем getter

    public void openStore(String openingTime){
        System.out.println(openingTime);
    }
    public void closeStore(String closingTime){
        System.out.println(closingTime);
    }

    public void addStaffMember(String staffMemberNameSurname){
        // Добавим количество сотрудников
        // Надо изменить переменную staffNumber
        String[] updatedStaffMembers = new String[staffMembers.length + 1];
        System.arraycopy(staffMembers, 0, updatedStaffMembers, 0, staffMembers.length);
        updatedStaffMembers[updatedStaffMembers.length - 1] = staffMemberNameSurname;
        staffNumber = updatedStaffMembers.length;

        // !!! ДЛЯ ВАС ПОДУМАТЬ !!!
        // Получается, что я создал временный массив в методе, его правильно обновил, но ОРИГИНАЛЬНЫЙ МАССИВ
        // Поле класса String[] staffMembers пока не изменился.
        // ВОПРОС: Можно ли изменить код таким образом, чтобы решить эту дилемму?
        System.out.println(Arrays.toString(updatedStaffMembers));
    }

    public void paySalary(int date, String month){
        // Мы получаем зарплату с 1 по 10 число каждого месяца
        System.out.println("-".repeat(130));
        System.out.println(storeName + " pays salary from 1 to 10 number of every month.");
        System.out.println("Today is " + date + " of " + month);
        if (date >= 1 && date <= 10){
            System.out.println("Salary had been paid!");
            composeReceipt(date, month);
        } else {
            System.out.println("It is not a salary day.");
            System.out.println("Salary request has been cancelled!");
        }
        System.out.println("-".repeat(130));
    }

    public void composeReceipt(int date, String month){
        long temp = storeBudget;
        for(int index = 0; index < staffMembers.length; index++){
            System.out.println("Staff member " + (index + 1) + ": " + staffMembers[index] + ": " + staffWage + "USD");
            storeBudget -= staffWage;
        }
        System.out.println("Before salary BUDGET AMOUNT: " + temp);
        System.out.println("Total budget left after salary paid: " + storeBudget);
        System.out.println("On " + month + " " + date + " " + storeName +
                " allocated from budget: " + (temp-storeBudget) + "USD.");
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public long getStoreBudget(){
        return storeBudget;
    }

    public long getStaffWage() {
        return staffWage;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStaffWage(long staffWage) {
        this.staffWage = staffWage;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public String getStoreInformation(){
        return "Store:\n" +
                "\tName: " + storeName +
                "\n\tAddress: " + storeAddress +
                "\n\tStaff Number: " + staffNumber +
                "\n\tStaff Members: " + Arrays.toString(staffMembers) +
                "\n\tStaff Wage: " + staffWage +
                "\n\tStaff Product: " + Arrays.toString(storeProduct) +
                "\n\tBudget: " + storeBudget;
    }

    // Для получения данных об ОБЪЕКТЕ используется ПОЛИМОРФИЗМ
    // Если у нас есть супер ОБЪЕКТ - Object, а все наши другие объекты находятся в наследовании от него
    // Значит мы можем посмотреть какие свойства есть у Объекта, которые мы унаследовали
    // toString() - Arrays.toString()
    // Давай-ка я возьму метод toString() от супер-класса Object и задам ему свое оформление - это и есть ПОЛИМОРФИЗМ
    @Override
    public String toString() {
        return "Store:\n" +
                "\tName: " + storeName +
                "\n\tAddress: " + storeAddress +
                "\n\tStaff Number: " + staffNumber +
                "\n\tStaff Members: " + Arrays.toString(staffMembers) +
                "\n\tStaff Wage: " + staffWage +
                "\n\tStaff Product: " + Arrays.toString(storeProduct) +
                "\n\tBudget: " + storeBudget;
    }
}
