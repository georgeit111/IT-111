import java.util.Scanner;

public class GradeAveraging {

   public static void main(String[] args) {

//  ask the end user to input their numerical grades

       int counter = 1;
int grade;
double total = 0;
double average;

       Scanner input = new Scanner(System.in);
       // our while loop will count how many times we are asking the end user to input a grade

       while(counter <= 5) {
           System.out.println("Please enter your " +counter+ " numerical grade");
           grade = input.nextInt();
           total += grade;
           counter += 1;

       } //       close while loop


       char letterGrade;
       String message;

       counter -= 1;
       average = total/counter;

       System.out.println("You have earned an average grade of " +average+ " after providing us with " +counter+ " grades");


       if(average >= 90 && average <= 100) {
    letterGrade ='A';
    message = "Excellent work!";
}

 else if(average >= 80 && average <= 90) {
       letterGrade ='B';
        message = "Solid work!";

}
else if(average >= 70 && average <= 80) {
    letterGrade ='C';
        message = "More studying necessary!";

       } else if(average >= 65 && average <= 70) {
    letterGrade ='D';
        message = "Squeaking bye!";

       } else

    {
        letterGrade = 'F';
        message = "Not a passing grade!";


    }

       System.out.println("letterGrade: You have earned an average grade of " +letterGrade);
       System.out.println(counter);
       System.out.println(average);
       System.out.println("Message : " +message);


   }
}

