package EarlyOop;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("");
        Scanner scanner = new Scanner(System.in);

//        System.out.println(account.getName());
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();


        //for account number
        System.out.println("Enter your account number: ");
        int number = scanner.nextInt();

        account.setName(name);
        System.out.println("Your account name is " + account.getName());
        account.setNumber(number);
        System.out.println("Your account number is " + account.getNumber());
    }
}
