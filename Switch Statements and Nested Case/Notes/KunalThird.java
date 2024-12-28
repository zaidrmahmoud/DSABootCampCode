// KunalThird.java

import java.util.Scanner;

public class KunalThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String fruit = sc.next();

        /*
         * 'switch' statement Syntax:
         * switch (expression) {
         * case one:
         * // do something
         * break;
         * case two:
         * // do something
         * break;
         * }
         */
        // NOTE: IF YOU DO NOT PUT 'break' STATEMENT, IT WILL CHECK THE NEXT CASES

        // INFO: Example:
        // NOTE: Regular NOT Enhanced Switch Statement
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break; // ! If I remove the break statement, and the input is "Orange", it will print "Round fruit" and "Small fruit"
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

        // NOTE: Enhanced Switch Statement, also known as Rule Switch Statement. Just hover over the word 'switch' and press Ctrl + . then convert to rule switch statement
        switch (fruit) {
            case "Mango" -> { // ! Curly braces are optional
                System.out.println("King of fruits");
            }
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }


        // INFO: In the following example, we are using the switch statement to determine if the day of the week is a weekday or a weekend, and it will not break till it reaches the answer.

        System.out.print("Enter day of the week: ");
        int dayofweek = sc.nextInt();
        switch (dayofweek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
        
        // INFO: Enhanced Switch Statement for the above example:

        switch(dayofweek) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        // Regular Switch Statement for the following example of: 
        // HACK: NESTED SWITCH STATEMENT:
        
        System.out.print("Enter EmpID: ");
        int empID = sc.nextInt();
        System.out.print("Enter Department: ");
        String department = sc.next();
        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Zaid Mahmoud");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // HACK: Enhanced Switch Statement for the above example:
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Zaid Mahmoud");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}