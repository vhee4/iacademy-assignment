package EarlyOop;

import java.util.Scanner;

public class NewBankTest {
    public static void main(String[] args) {
        NewBank newBank = new NewBank("",2003005006, 100);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String accountName = scan.nextLine();
        System.out.printf("Your account name is %s", accountName);

    }
}
