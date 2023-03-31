import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //INITIALIZING THE VARIABLES
        double weightInKilograms;
        double heightInMeters;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        weightInKilograms = input.nextDouble();

        System.out.println("Enter your height: ");
        heightInMeters = input.nextDouble();

        double bmi = (weightInKilograms / (heightInMeters * heightInMeters));
        System.out.printf("Your body mass index (BMI) is %.2f\n\n", bmi);

        //CONDITIONAL STATEMENT

        if (bmi < 18.5) {
            System.out.printf("The patient is underweight\n");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("The patient is having a normal weight");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("The patient is overweight");
        }
        else {
            System.out.println("The patient is Obesity in nature");
        }

        // SECOND QUESTION
        double totalMiles;
        double costOfGasolinePerGallon;
        double averageMilesPerGallon;
        double parkingFeesPerDay;
        double TollsPerDay;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the total miles you drive per day: ");
        totalMiles = input2.nextDouble();
        System.out.println("Enter the Cost of Gasoline per Gallon: ");
        costOfGasolinePerGallon = input2.nextDouble();
        System.out.println("Enter the average miles covered with per 1 Gallon of Gasoline: ");
        averageMilesPerGallon = input2.nextDouble();
        System.out.println("Enter parking fees paid per day: ");
        parkingFeesPerDay = input2.nextDouble();
        System.out.println("FINAL STEP! Enter the tolls: ");
        TollsPerDay = input2.nextDouble();

        double costOfGasolinePerDay = ((totalMiles / averageMilesPerGallon) * costOfGasolinePerGallon);
        double dailyDrivingCost = costOfGasolinePerDay + parkingFeesPerDay + TollsPerDay;
        System.out.printf("Your Daily Driving Cost is %.2f", costOfGasolinePerDay);


    }
}
