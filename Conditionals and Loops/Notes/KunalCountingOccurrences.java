// KunalCountingOccurrences.java
// ! Write a program to count the number of occurrences of a digit in a number

import java.util.Scanner;

public class KunalCountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the digit who's occurrences you want to count: ");
        int digit = sc.nextInt();
        int count = 0;
        int original = n;

        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The digit " + digit + " occurs " + count + " times in the number " + original);
        sc.close();
    }
}
