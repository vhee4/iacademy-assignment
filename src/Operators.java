import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        //if (condition){statements}
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = input.nextInt();

        System.out.println("Enter the second number");
        secondNumber = input.nextInt();


        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are equal");
        }

        if (firstNumber != secondNumber) {
            System.out.println("Both numbers are not equal");
        }

        if (firstNumber > secondNumber) {
            System.out.println("first number is greater");
        }

        if (firstNumber < secondNumber){
            System.out.println("second number is greater");
        }


    }
}
