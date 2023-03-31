import java.util.Scanner;

public class KehindeTest {

    private String name;

   public static void main(String [] args){

       int grade;

       Scanner score = new Scanner(System.in);
       System.out.println("Please Enter the grade of the student: ");
       grade = score.nextInt();

       if(grade >= 80)
       {
           System.out.println("A");
       }
       else if(grade >= 70)
       {
           System.out.println("B");
       }
       else if(grade >= 60)
       {
           System.out.println("C");
       } else if (grade >= 50)
       {
           System.out.println("D");
       }
       else
       {
           System.out.println("F");
       }
   }
}
