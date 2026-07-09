package lesson_9_abstract_interf.deepInherit;

public class ATMMoreAdvanced extends ATMMore{
    private final int hiddenNumber;

    public ATMMoreAdvanced(String atm, long account, String credentials) {
        super(atm, account, credentials);
        this.hiddenNumber = 987110;
    }

    public int getHiddenNumber(){
        return this.hiddenNumber;
    }
}