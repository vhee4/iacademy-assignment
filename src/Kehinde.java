public class Kehinde {
    private String name;
    private double average;

    public Kehinde(String name, double average) {
        this.name = name;
        if (average >= 0) {
            if (average <= 100) {
                this.average = average;
            }
        } else {
            System.out.println("Your average is out of range");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAverage() {
        if (average >= 0) {
            if (average <= 100) {
                this.average = average;
            }
        } else {
            System.out.println("Your average is out of range");
        }
    }

    public double getAverage() {
        return this.average;
    }

    public String getLetterGrade() {
        String grade;

        if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);
        return grade;
    }

    public static void main(String[] args)
    {
        //creating object student
        Kehinde student = new Kehinde("I Academy", 95);
        student.getLetterGrade();
        //System.out.println(student.getLetterGrade());
    }
}
