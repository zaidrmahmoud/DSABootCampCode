// KunalGradesDisplay.java

import java.util.Scanner;

public class KunalGradesDisplay {
    Scanner sc = new Scanner(System.in);
    
    public String GradeCalculator(int marks) {
        if(marks >= 90) {
            return "A";
        }
        else if(marks >= 80 && marks < 90) {
            return "B";
        }
        else if(marks >= 70 && marks < 80) {
            return "C";
        }
        else if(marks >= 60 && marks < 70) {
            return "D";
        }
        else if(marks >= 50 && marks < 60) {
            return "E";
        }
        else {
            return "F";
        }
    }
}