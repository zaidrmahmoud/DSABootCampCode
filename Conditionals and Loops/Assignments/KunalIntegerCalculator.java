// KunalIntegerCalculator.java

import java.util.Scanner;

public class KunalIntegerCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int i = 1;
        System.out.print("Enter the number of numbers to be calculated: ");
        int numPrinted = in.nextInt();
        double[] numbers = new double[numPrinted];
        System.out.print("Enter the first number: ");
        double num = in.nextDouble();
        numbers[0] = num;

        while (i < numPrinted) {
            System.out.print("Enter Number " + (i+1) + ": ");
            num = in.nextDouble();
            numbers[i] = num;
            i++;
        }

        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        switch (op) {
            case '+' -> {
                i = 0;
                while (i < numbers.length) {
                    ans += numbers[i];
                    i++;
                }
                System.out.println("The SUM is: " + ans);
            }
            case '-' -> {
                while (i < numbers.length) {
                    ans -= numbers[i];
                    i++;
                }
                System.out.println("The DIFFERENCE is: " + ans);
            }
            case '*' -> {
                while (i < numbers.length) {
                    ans *= numbers[i];
                    i++;
                }
                System.out.println("The PRODUCT is: " + ans);
            }
            case '/' -> {
                while (i < numbers.length) {
                    ans /= numbers[i];
                    i++;
                }
                System.out.println("The QUOTIENT is: " + ans);
            }
            default -> {
                System.out.println("Invalid operator");
            }
        }
    }
}
