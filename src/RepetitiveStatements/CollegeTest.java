package RepetitiveStatements;

import java.util.Scanner;

public class CollegeTest {
    /**
     * A college offers a course that prepares students for the state licensing exam for real-estate brokers. Last year, ten of the students who completed this course took the exam. The college wants to know how well its students did on the exam. You’ve been asked to write a program to summarize the results. You’ve been given a list of these 10 students. Next to each name is written a 1 if the student passed the exam or a 2 if the student failed.
     * Your program should analyze the results of the exam as follows:
     * 1. Input each test result(i.e.,a 1 or a 2).Display the message“Enter result”
     * on the screen each time the program requests another test result.
     * 2. Count the number of test results of each type.
     * 3. Display a summary of the test results,indicating the number of students who passed and the number who failed.
     * 4. If more than eight students passed the exam,print“Bonus to instructor!”
     */
    public static void main(String[] args) {
/**
 * initialize studentCounter = 1
 * initialize passCount = 0
 * initialize failsCount = 0
 *
 * while(student <= 10){
 *     increment studentCounter
 *     check if each input is a pass or fail
 *     if pass, increment passCount
 *     if fail, increment failCount
 *
 *     check if no of passes > 8
 * }
 */
    int studentCounter = 1; //beginning with the first student
    int passesCount = 0;
    int failCount = 0;
    int testResults;
    int forTestResult;
    Scanner scanner = new Scanner(System.in);

    while(studentCounter <= 10){
        System.out.println("Enter a result! 1 for Pass, 2 for Fail"); //prompt user to input value
        testResults = scanner.nextInt(); //variable to hold user's input
        studentCounter++; //statement to go to the next student

        if (testResults == 1){
            passesCount++;
        }
        if (testResults == 2){
            failCount++;
        }
    }
    if (passesCount > 8){
        System.out.println("Bonus to Instructor");
    }
        System.out.printf("Total passes %d\nTotal failures %d\n", passesCount, failCount);


    for (int studCounter=0; studCounter < 10; studCounter++){
        System.out.println("Enter a result: 1 for Pass, 2 for fail");
        forTestResult = scanner.nextInt();

//        int counter = forTestResult == 1 ? passesCount++ : failCount++;

        if (forTestResult == 1){
            passesCount++;
        }
        if (forTestResult == 2){
            failCount++;
        }

        if (passesCount > 8){
            System.out.println("Bonus to the instructor!");
        }
    }
    }



}
