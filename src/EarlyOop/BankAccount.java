package EarlyOop;

public class BankAccount {
    private String accountName;
    public double accountBalance;

    //CONSTRUCTOR
    public BankAccount(String accountName, double accountBalance){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    //SETTER & GETTER FOR ACCOUNT NAME
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }

    //SETTER & GETTER FOR ACCOUNT BALANCE
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    //METHODS FOR DEPOSIT AND DEBIT
    public void deposit(double amount){
         accountBalance = getAccountBalance() + amount;
    }
    public void debit(double amount){
        accountBalance = getAccountBalance() - amount;
    }
}
