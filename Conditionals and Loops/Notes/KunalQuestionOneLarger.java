// KunalQuestionOneLarger.java
// ! Write a program to find the largest of the three numbers

import java.util.Scanner;

public class KunalQuestionOneLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest number is: " + max);

        // INFO: Another way to do this is using the Math.max() method. Syntax: Math.max(a, b)
        int max2 = Math.max(a, Math.max(b, c));
        System.out.println("The largest number is: " + max2);
        sc.close();
    }
}