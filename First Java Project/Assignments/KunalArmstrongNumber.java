// KunalArmstrongNumber.java

import java.util.Scanner;

public class KunalArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = s.nextInt();
        s.close();
        int originalNum = num;
        int sum = 0;
        int digits = 0;
        boolean isArmstrong;

        while (num > 0) {
            digits++;
            num /= 10;
        }

        num = originalNum;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == originalNum) {
            isArmstrong = true;
        }
        else {
            isArmstrong = false;
        }

        if (isArmstrong) {
            System.out.println("This is an Armstrong number.");
        } else {
            System.out.println("This is not an Armstrong number.");
        }
    }
}