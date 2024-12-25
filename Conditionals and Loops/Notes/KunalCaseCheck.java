// KunalCaseCheck.java
// ! Write a program to check if a character is uppercase or lowercase

import java.util.Scanner;

public class KunalCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase");
        } else {
            System.out.println("The character is uppercase");
        }
        sc.close();
    }
}