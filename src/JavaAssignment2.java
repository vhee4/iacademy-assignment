import java.util.Scanner;

public class JavaAssignment2 {
    public static void main(String[] args) {
       //exercise 2.171
        int age;
        int pin;
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your pin: ");
        pin = input.nextInt();

        System.out.println("Enter the current year: ");
        year =input.nextInt();

        int sum = age +  pin + year;
        int average = (sum / 3);
        int product = (age * pin * year);

        int smallest = age;
        int largest = age;

        if(pin < smallest){
            smallest = pin;
//            System.out.printf("\n%d is the smallest number",pin);
        }
        if (year < smallest){
            smallest = year;
//            System.out.printf("\n%d is the smallest number",year);
        }
        if (pin > largest){
            largest = pin;
//            System.out.printf("\n%d is the largest number",year);

        }
        if (year > largest){
            largest = year;
//            System.out.printf("\n%d is the largest number",year);
        }

        System.out.printf("The sum is: %d\nThe average is: %d\nThe product is: %d\nSmallest is: %d\nLargest is: %d", sum, average, product, smallest, largest);



    }
}
