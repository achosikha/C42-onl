package lesson_9_abstract_interf.deepInherit;

public class ATM {
    private final String atm;
    private final long account;
    private final String credentials;

    public ATM(String atm, long account, String credentials) {
        this.atm = atm;
        this.account = account;
        this.credentials = credentials;
    }

    public String getAtm(){
        return this.atm;
    }

    public long getAccount(){
        return this.account;
    }

    public String getCredentials(){
        return this.credentials;
    }

    @Override
    public String toString() {
        return "ATM: " + this.atm +
                "Account: " + this.account +
                "Credentials: " + this.credentials;
    }
}