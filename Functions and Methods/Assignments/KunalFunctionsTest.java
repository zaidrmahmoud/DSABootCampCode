// KunalFunctionsTest.java

import java.util.Scanner;
public class KunalFunctionsTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, welcome to the pythagorean theorem calculator.");

        System.out.print("Enter a number: ");
        double a = in.nextDouble();

        System.out.print("Enter another number: ");
        double b = in.nextDouble();

        System.out.print("Enter a number to check if it is a Pythagorean triplet: ");
        double c2 = in.nextDouble();
        
        if (KunalPythagoreanTriplet.isPythagoreanTriplet(a, b, c2)) {
            System.out.println("The numbers " + a + ", " + b + ", and " + c2 + " form a Pythagorean triplet.");
        }
        else {
            System.out.println("The numbers " + a + ", " + b + ", and " + c2 + " do not form a Pythagorean triplet.");
        }

    }
}