import java.util.Scanner;

public class Kehinde2 {
    public static void main(String[] args)
    {
        int studentCounter = 1;
        int score;
        double average;
        int totalScore = 0;
        int flagValue = -1;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter student %d's score\n", studentCounter);
        score = scan.nextInt();
        totalScore = totalScore + score;

        while (studentCounter != flagValue)
        {
            studentCounter = studentCounter+1;
            System.out.printf("Enter student %d's score\n", studentCounter);
            score = scan.nextInt();
            totalScore = totalScore + score;
            System.out.println("total score is: " + totalScore);
        }
        if(studentCounter != 0){
        average= (double) totalScore /studentCounter;
        System.out.printf("Total number of students is: %d\nTotal score is: %d\nThe average is: %.2f", studentCounter, totalScore, average);
        }else{
            System.out.println("NO grades entered!");
        }
    }
}
