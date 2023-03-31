package EarlyOop;

import java.util.Scanner;

public class HackerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int");
        int i = scan.nextInt();
        System.out.println("enter an a double");
        double d = scan.nextDouble();
        System.out.println("enter an string");
        scan.nextLine();
        String s = scan.nextLine();
        int t = 1;



        // Write your code here.

        System.out.println("String:" + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
