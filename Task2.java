//Task2: Project On Student_Grade_Calculator

import java.util.*;

public class Task2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("************STUDENT GRADE CALCULATOR************");
        System.out.println("Enter the number of subjects: ");
        
        int s = sc.nextInt();
        int total=0;
        System.out.println("Enter the marrks obtained in "+s+" subjects respectively: ");
        for(int i=0; i<s; i++){
            int marks = sc.nextInt();
            total = total+marks;

        }
        //AP is average percentage
        double AP=(double)total/s;
        String Grade;
        if(AP>=90){
            Grade = "A+";

        }
        else if(AP>=80){
            Grade="A";
        }
        else if (AP>=70){
            Grade="B";
        }
        else if(AP>=60){
            Grade="C";

        }
        else if(AP>=50){
            Grade="D";
        }
        else if(AP>=40){
            Grade="E";
        }
        else {
            Grade="Fail(F)";
        }

        System.out.println("Total Marks = "+total);
        System.out.println("Average percentage = "+AP+"%");
        System.out.println("Grade is: "+Grade);
    }
    
}
