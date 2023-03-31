package EarlyOop;
public class NewBank{
    private String accountName;
    private double accountNumber;
    private double accountBalance;

    public NewBank(String accountName, double accountNumber, double accountBalance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount){
    accountBalance = getAccountBalance() + amount;
    }
    public void debit(double amount){
        accountBalance = accountBalance - amount;
    }
}
