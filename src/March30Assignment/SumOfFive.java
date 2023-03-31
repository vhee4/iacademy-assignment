package March30Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFive {

    /**
     * 2. Write a method that accepts 5 integers from a user and sums them.
     *returning an int (the sum)
     * the user should put in five figures //scanner
     * the method can take in max and min of 5
     * sum each of the figures
     *
     */
    //METHOD 1
    public static void fillingArray(int[] n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers :");
        for(int i = 0; i < n.length; i++){
            n[i] = scanner.nextInt(); //user can now input five values into the array called n
        }
    }

    public static int sumArray(int[] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++){
           sum += n[i];
        }
        return sum;
    }

    //METHOD 2
    public static int combinedMethod(){ //number specifies the amount of numbers to be found inside the array
        int[] n = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter 5 numbers :\n");
        for(int i = 0; i < n.length; i++){
            n[i] = scanner.nextInt();
            sum += n[i];//user can now input five values into the array called n and can find the sum of the values
        }
//        System.out.println("The sum of the numbers are : " + sum);
        return sum;
    }


    public static void main(String[] args) {

//        int[] n = new int[5];
//        fillingArray(5);
//        System.out.println(sumArray(n)); ;
        System.out.println(combinedMethod());
    }
}
