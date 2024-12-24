// KunalFibonacciNumbers.java
// ! Write a program to print the nth Fibonacci number

import java.util.Scanner;

public class KunalFibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Fibonacci number you want to print: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + b);
        sc.close();
    }
}
