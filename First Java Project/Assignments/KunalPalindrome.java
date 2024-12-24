// KunalPalindrome.java

import java.util.Scanner;

public class KunalPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String checkpal = s.nextLine();
        while (checkpal.length() == 1) {
            System.out.print("Please enter a valid word (More than 1 letter): ");
            checkpal = s.nextLine();
        }
        s.close();
        int startcount = 0;
        int endcount = checkpal.length() - 1;
        boolean isPalindrome = true;
        while (startcount < endcount) {
            if (checkpal.charAt(startcount) != checkpal.charAt(endcount)) {
                isPalindrome = false;
                break;
            }
            startcount++;
            endcount--;
        }
        if (isPalindrome) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}

