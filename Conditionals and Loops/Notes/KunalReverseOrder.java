// KunalReverseOrder.java
// ! Write a program to reverse a number

import java.util.Scanner;

public class KunalReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reversed number is: " + rev);
        sc.close();
    }
}
