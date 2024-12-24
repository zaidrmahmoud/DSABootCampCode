// KunalCalculator.java
// ! Write a program to make a calculator

import java.util.Scanner;

public class KunalCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (op == '+') {
                    System.out.println("The sum of the two numbers is: " + (a + b));
                }
                else if (op == '-') {
                    System.out.println("The difference of the two numbers is: " + (a - b));
                }
                else if (op == '*') {
                    System.out.println("The product of the two numbers is: " + (a * b));
                }
                else if (op == '/') {
                    if (b != 0) {
                        System.out.println("The quotient of the two numbers is: " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }
                else if (op == '%') {
                    if (b != 0) {
                        System.out.println("The remainder of the two numbers is: " + (a % b));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
        }
    }
}
