// KunalFibonnaciSeries.java

import java.util.Scanner;

public class KunalFibonnaciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
        s.close();
    }
}
