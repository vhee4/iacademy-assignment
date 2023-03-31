package March30Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {
    /**
     * 5! = 5 * 4 * 3 * 2 * 1;
     *
     * int[] n = {n, n-1, n-2, n-3}
     *
     * whether using scanner or not,
     * take the user's number and create an array
     * int [] n =  new int[userInput]
     * say the number is 5
     * for (int i = n; i > 0; i--){
     *     product = product * n[i]
     * }
     *
     */

    public static int[] factorial(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = i + 1;
        }
        return array;
    }

    public static int product(int[] arr){
        int productArray = 1;
        for (int i = 0; i < arr.length; i++){
            productArray *= arr[i];
        }
        return productArray;
    }
//
//    public static void main(String[] args) {
//
//    }

//    import java.util.Arrays;


        public static void main(String[] args) {
            System.out.println(product(factorial()));
//            int number = 10; // The number we want to generate an array from
//            int[] array = generateArray(number);
//            System.out.println(Arrays.toString(array));
//            System.out.println(Arrays.toString(factorial()));

        }

//        public static int[] generateArray(int number) {
//            int[] array = new int[number];
//            for (int i = 0; i < number; i++) {
//                array[i] =i + 1;
//            }
//            return array;
//        }
    }

