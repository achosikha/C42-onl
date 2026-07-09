package lesson_9_abstract_interf.deepInherit;

public class ATMMore extends ATM{
    private final String internalMsg;

    public ATMMore(String atm, long account, String credentials) {
        super(atm, account, credentials);
        this.internalMsg = "This is ATM More class.";
    }

    public void getInternalMSG(){
        System.out.println(this.internalMsg);
    }
}