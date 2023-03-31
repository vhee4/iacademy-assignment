package RepetitiveStatements;

import java.util.Scanner;

public class BreakandContinue {
    public static String displayGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score");
        int score =scanner.nextInt();
        String grade ="";

        /**
         * switch (condition) {
         *      case 'distinct scenario':
         *              statement to be done;
         *              break; //needed if this is the preferred condition, hence the loop ends at this point.
         *      case 'distinct scenario b':
         *              statement to be done;
         *              break;
         *      case 'distinct scenario c':
         *              statement to be done;
         *              break;
         *      default:
         *              (other statements);
         *              break; //making the default the last statement will render the use of break inconsequential.
         * }
         *
         *
         *
         *
         */

        switch (score / 10){
            case 9, 8, 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            default:
                grade = "F";
        }
        return  grade;
    }

    public static void main(String[] args) {
        System.out.println(displayGrade());
    }
}
