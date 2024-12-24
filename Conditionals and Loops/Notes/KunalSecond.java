// KunalSecond.java

import java.util.Scanner;

public class KunalSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ! Use 'for' loops when you know exactly how many times you want to loop
        // ! Use 'while' loops when you don't know how many times you want to loop

        // ? For Loop Example: Printing numbers from 1 to 10
        // ? While Loop Example: Continuing to take input until the user enters '0'

        // ! NEW TYPE OF LOOP: do-while loop
        // ? It will run at least once always because it checks the condition after the loop runs at least once

        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);

        // In the code above, it will print "Hello World" once even though the condition is false because it checks the condition after the loop runs at least once
        
        // ! The trim() method removes any leading and trailing whitespace from a string
        // ! The charAt() method returns the character at a specified index in a string
        // ? To take a character input from a user, so only one letter, we cannot directly do that, so what we can do is: char [variablename] = sc.next().trim().charAt(index);
        // Example:
        System.out.print("Enter a word or a letter, we will take the first letter: ");
        char ch = sc.next().trim().charAt(0);
        System.out.println("The character given by the user is: " + ch); // 'h' is printed.

        // ! ANY NUMBER % 1O WILL RETURN THE LAST DIGIT OF THE NUMBER. Example: 1234 % 10 = 4
    }
}
