package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomePractice {
    /**
     * Create two different arrays with fixed sizes of your choice
     */
    public static void arrayCreation() {
        //    String[] stringArray = new String[15];
        String[] stringArray;
        stringArray = new String[6];
        String[] newStringArray = {"freda", "goat", "great"};
        int[] intArray = new int[4];
        intArray[0] = 5;
        intArray[1] = 4;
        int[] intArray1 = {1, 6, 7, 8};
        System.out.println(Arrays.toString(newStringArray));
        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));

    }

    public static void sortArray() {
        char[] sortArrays = {'a', 'u', 'f', 'e', 'q', 'c'};
//        Arrays.sort(sortArrays,1,4);
        System.out.println(Arrays.binarySearch(sortArrays, 'f'));
        System.out.println(sortArrays);

//        System.out.println(Arrays.sort(sortArrays));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers?(Max is 20): ");
        int n = scanner.nextInt();
        while (n > 20 || n < 0) {
            System.out.println("You have entered an invalid number! Try again: ");
            n = scanner.nextInt();
            int[] numbers = new int[n];
//        arrayCreation();
//        sortArray();
//        arrayProgram();


        }
//        private static void fillArrayOfIntegers(int[] numbers) {
//            Scanner scan = new Scanner(System.in);
//            for (int i = 0; i < numbers.length; i++){
//                numbers[i] = scan.nextInt();
//            }
    }
}