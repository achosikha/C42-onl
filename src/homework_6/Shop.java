package homework_6;

import java.util.Arrays;

// 1. Store - Name
// 2. Store - Address
// 3. Store Staff Number
// 4. Store Staff Members
// 5. Store Product
// 6. Close Store()
// 7. Open Store()
// 8. Add Staff Member
// 9. paySalary
// 10. Budget
public class Shop {
    public String storeName;
    public String storeAddress;
    public int staffNumber;
    public String[] staffMembers;
    public String[] storeProduct;
    public long staffWage;
    public long budget;

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
        long temp = budget;
        for(int index = 0; index < staffMembers.length; index++){
            System.out.println("Staff member " + (index + 1) + ": " + staffMembers[index] + ": " + staffWage + "USD");
            budget -= staffWage;
        }
        System.out.println("Before salary BUDGET AMOUNT: " + temp);
        System.out.println("Total budget left after salary paid: " + budget);
        System.out.println("On " + month + " " + date + " " + storeName +
                            " allocated from budget: " + (temp-budget) + "USD.");
    }

    public String getStoreInformation(){
        return "Store:\n" +
                "\tName: " + storeName +
                "\n\tAddress: " + storeAddress +
                "\n\tStaff Number: " + staffNumber +
                "\n\tStaff Members: " + Arrays.toString(staffMembers) +
                "\n\tStaff Wage: " + staffWage +
                "\n\tStaff Product: " + Arrays.toString(storeProduct) +
                "\n\tBudget: " + budget;
    }
}
