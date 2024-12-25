// KunalCalendarHangout.java

import java.util.Scanner;

public class KunalCalendarHangout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many months would you like to check the hangout days for?: ");
        int months = scanner.nextInt();
        String[] monthNames = new String[months];
        int[] dayspermonth = new int[months];
        for (int i = 0; i < months; i++) {
            System.out.print("What is the name of month " + (i + 1) + "?: ");
            monthNames[i] = scanner.next();
        }
        for (int i = 0; i < months; i++) {
            System.out.print("How many days are you allowed to hangout in " + monthNames[i] + "?: ");
            int days = scanner.nextInt();
            dayspermonth[i] = days;
        }
        System.out.print("Thank you! Now, would you like to check the hangout days for a specific month or all months, or none? (Answer with: All/Specific/None): ");
        String answer = scanner.next();
        switch (answer) {
            case "All" -> {
                for (int i = 0; i < months; i++) {
                    System.out.println("You are allowed to hangout for " + dayspermonth[i] + " days in " + monthNames[i]);
                }
            }
            case "Specific" -> {
                System.out.print("What month would you like to check the hangout days for?: ");
                String month = scanner.next();
                for (int i = 0; i < months; i++) {
                    if (month.equals(monthNames[i])) {
                        System.out.println("You are allowed to hangout for " + dayspermonth[i] + " days in " + month);
                    }
                    else {
                        System.out.println("Sorry, that month is not in the list.");
                    }
                    break;
                }
            }
            case "None" -> System.out.println("Thank you for using KunalCalendarHangout!");
            case "all" -> {
                for (int i = 0; i < months; i++) {
                    System.out.println("You are allowed to hangout for " + dayspermonth[i] + " days in " + monthNames[i]);
                }
            }
            case "specific" -> {
                System.out.print("What month would you like to check the hangout days for?: ");
                String monthInput = scanner.next();
                for (int i = 0; i < months; i++) {
                    if (monthInput.equals(monthNames[i])) {
                        System.out.println("You are allowed to hangout for " + dayspermonth[i] + " days in " + monthInput);
                    }
                    else {
                        System.out.println("Sorry, that month is not in the list.");
                    }
                    break;
                }
            }
            case "none" -> System.out.println("Thank you for using KunalCalendarHangout!");
            default -> System.out.println("Sorry, that is not a valid answer.");
        }
    }
}