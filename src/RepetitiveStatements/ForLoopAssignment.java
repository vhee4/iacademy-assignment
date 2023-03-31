package RepetitiveStatements;

import java.util.Scanner;

public class ForLoopAssignment {
    /**
     * write a program that prints out all even numbers between 0 and 100 (100 inclusive). use for loop
     *
     * initialize the int var
     * condition (i = 0, i<=100, i++)
     */
    private int i;
    public void EvenClass() {
        System.out.println("These are even numbers");
        for (i = 0; i <= 100; i++) {
////            i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }
    public void OddClass() {
            System.out.println("\nThese are odd numbers");
        for(i = 0; i <= 100; i++){
            if(i % 2 != 0){
                System.out.print(" " + i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ForLoopAssignment input = new ForLoopAssignment();
        input.EvenClass();
        input.OddClass();


//        int i;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("These are even numbers");
//        for(i = 0; i <= 100; i++){
////            i = scanner.nextInt();
//            if(i % 2 == 0){
//                System.out.print(" " + i + " ");
//            }
//        }
//        System.out.println("\nThese are odd numbers");
//        for(i = 0; i <= 100; i++){
//            if(i % 2 != 0){
//                System.out.print(" " + i + " ");
//            }
//        }

    }


}
