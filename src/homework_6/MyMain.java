package homework_6;

public class MyMain {
    static void main() {
        createShop();
    }

    public static void createShop(){
        Shop apple = new Shop();
        System.out.println(apple.getStoreInformation());

        apple.storeName = "Apple Store";
        apple.storeAddress = "12, Baker Street, LA, USA";
        apple.staffMembers = new String[]{
                "John Malkovich",
                "Billy Jane",
                "Jennifer Gartneth",
                "Yulia Skolkova",
                "Vladimir Potapov",
                "Peter Johnson",
                "Katty Swanson"
        };
        apple.staffNumber = apple.staffMembers.length;
        apple.staffWage = 1978L;
        apple.storeProduct = new String[]{
                "Apple", "Garlic", "Bread", "Milk", "Juice", "Coca-Cola", "Grapes", "Lighter"
        };
        apple.budget = 1_000_411_1L;

        System.out.println("Apple store created, data updated: ");
        System.out.println(apple.getStoreInformation());

        apple.openStore(apple.storeName + " had been OPENED at 09.00 AM on Feb 26 TUE 2026");
        apple.paySalary(1, "March");

        System.out.println("Прошел еще один месяц. Пожалуйста сделайте дополнительную выплату зарплаты.");
        System.out.println("-".repeat(130));
        apple.paySalary(10, "April");
        System.out.println("-".repeat(130));
        System.out.println("I would like to ADD a STAFF MEMBER to " + apple.storeName);
        apple.addStaffMember("Ryan Giggze");
        System.out.println("-".repeat(130));
        System.out.println("Let me still check data about our store before we will close.");
        System.out.println(apple.getStoreInformation());
        System.out.println("-".repeat(130));
        apple.closeStore(apple.storeName + " had been CLOSED at 06.00 PM on Feb 26 TUE 2026.");
    }
}
