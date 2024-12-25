// KunalChildrenArea.java

import java.util.Scanner;

public class KunalChildrenArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to check how many children are in the area? (Answer with: Yes/No): ");
        String answer = scanner.next();
        int children = 0;
        boolean check = true;
        while (check) {
            if (answer.equals("Yes")||answer.equals("yes")) {
                System.out.print("Around what age are you looking for?: ");
                int age = scanner.nextInt();
                if (age < 5) {
                    children = (int) (Math.random() * 50);
                    check = false;
                } else if (age < 13) {
                    children = (int)(Math.random() * 200);
                } else {
                    while (age > 13) {
                        System.out.println("Sorry, that age is too old.");
                        System.out.print("I am gonna ask one more fucking time zayed, around what age are you looking for?: ");
                        age = scanner.nextInt();
                    }
                }
                System.out.print("Guess how many children are in the area you horny ass pedophile?: ");
                int guess = scanner.nextInt();
                
                if (guess == children) {
                    System.out.println("That's correct!");
                    check = false;
                } else {
                    System.out.println("Actually, there are " + children + " children in the area you pedophile zayed.");
                    check = false;
                }
            }
            else if (answer.equals("No")||answer.equals("no")) {
                System.out.print("We both know you are a pedophile zayed, try again: ");
                answer = scanner.next();
            }
            else {
                System.out.print("Please answer with: Yes/No: ");
                answer = scanner.next();
            }
        }
    }
}