package Entity;

public class Account {

    private int numberAccount;
    private String holderAccount;
    private double valueAccount;

    public Account(int numberAccount, String holderAccount, double valueAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.valueAccount = valueAccount;
    }

    public Account(int numberAccount, String holderAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getValueAccount() {
        return valueAccount;
    }

    public void depositValueAccount(double deposit){
        this.valueAccount += deposit;
    }

    public void withdrawValueAccount(double withdraw){
        this.valueAccount -= withdraw + 5.00;
    }

    @Override
    public String toString() {
        return "Account " + getNumberAccount() +
                ", Holder " + getHolderAccount()  +
                ", Balance " + getValueAccount();
    }
}
