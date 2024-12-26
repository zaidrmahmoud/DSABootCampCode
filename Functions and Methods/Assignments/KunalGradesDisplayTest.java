// KunalGradesDisplayTest.java

import java.util.Scanner;

public class KunalGradesDisplayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KunalGradesDisplay gradeDisplay = new KunalGradesDisplay();
        
        System.out.print("Hello! Please enter the marks of the student: ");
        int marks = sc.nextInt();
        System.out.println("The grade of the student is: " + gradeDisplay.GradeCalculator(marks));
    }
}