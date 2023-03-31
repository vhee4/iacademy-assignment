package March30Assignment;

import java.lang.module.FindException;
import java.net.BindException;
import java.util.Scanner;

public class CorrectPin {

    /**
     * 4. 7
     *
     */
    public static void main(String[] args) {
        int n = 7116;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin");
            for (int i = 0; i < 4; i++) {
                int input = scanner.nextInt();
                String input1 = Integer.toString(input);
                input1.length();
                if (input == n) {
                    System.out.println("Correct, welcome back.");
                    break;
                } else if (input != n && i < 3) {
                    System.out.println("Incorrect, try again.");
                } else if (input != n && i == 3){
                    System.out.println("sorry, but we've locked you out");
    //[FindException] else if (scanner.hasNextBoolean(BindException)

                }

            }
    }

}
