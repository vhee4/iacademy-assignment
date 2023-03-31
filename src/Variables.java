import java.util.Scanner;

public class Variables
{
    public static void main(String[] args) {
        int age;
        int game;
        // Scanner is a feature used to allow users input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        age = scanner.nextInt();

        System.out.println("Enter the game: ");
        game = scanner.nextInt();

        int sum = game + age;
        System.out.printf("The sum is %d", sum);

    }

}
/**
 * DATA TYPES
 * int - integer(for counting numbers)
 * double - for decimal(better to use double than float). There is also something called BIG DECIMAL, and it is more precise than double.
 * float - alt for double. example: float x = 20.0f (you must add f to the number). it is not used often
 * ---- in writing data types, always use this format: (DATA TYPE - NAME OF VARIABLE = VALUE OF VARIABLE)
 * ---- you can assign the type to a variable just once and can reuse it
 * boolean - used for conditions
 * String - always use capital letter
 * char - just an alphabet. must use single quotes e.g char initials = 'a'
 */



