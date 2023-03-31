import java.util.Scanner;

public class oddEvenTest {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.printf("%d is an even number\n", num);
        }
        if (num % 2 == 1){
            System.out.printf("%d is an odd number\n", num);
        }
    }
}
