import EarlyOop.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Tobiloba", 64546737);
//        System.out.println("Your bank account name" + " " + bankAccount.getAccountName() + "\nYour bank account balance is" + " " + bankAccount.getAccountBalance());
        Scanner scan = new Scanner(System.in);
        String name;
        double balance;
        System.out.println("Enter your account name: ");
        name = scan.nextLine();
        System.out.println("Enter your account balance: ");
        balance = scan.nextDouble();
        BankAccount bankAccount1 = new BankAccount(name, balance);
        System.out.printf("Congrats! your account name is: %s\nYour account number is : %.2f\n", bankAccount1.getAccountName(), bankAccount1.getAccountBalance());

        //deposit and debit
        System.out.println("Enter the amount you want to deposit");
        double depositAmount = scan.nextDouble();
        bankAccount1.deposit(depositAmount);
        System.out.printf("You have added %.2f to your account and your new account balance is %.2f\n", depositAmount, bankAccount1.getAccountBalance());


        System.out.println("Enter the amount you want to withdraw");
        double debitAmount = scan.nextDouble();
        bankAccount1.debit(debitAmount);
        System.out.printf("You just withdrew %.2f from your account and your new account balance is %.2f\n", debitAmount, bankAccount1.getAccountBalance());


        bankAccount1.deposit(3000);
        System.out.printf("Congrats! Your new account balance is : %.2f\n", bankAccount1.getAccountBalance());
        bankAccount1.debit(2500);
        System.out.printf("Congrats! Your new account balance is : %.2f", bankAccount1.getAccountBalance());


    }
}
