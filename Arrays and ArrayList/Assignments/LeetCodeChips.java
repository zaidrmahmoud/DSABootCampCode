// LeetCodeChips.java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeChips {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, choose out the array that you would like to test! Print '-1' to stop printing!");
        ArrayList<Integer> array = new ArrayList(5);
        int start = 0;
        while (start != -1) {
            System.out.print("Enter a Number: ");
            start = in.nextInt();
            if (start == -1) {
                break;
            }
            array.add(start);
        }
        int[] arr = new int[array.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array.get(i);
        }
        System.out.println("The total cost for the chips to be moved is: " + minCostToMoveChips(arr));
    }
    public static int minCostToMoveChips(int[] position) {
        int finalPos = mostRepeated(position);
        int currentPos;
        int cost = 0;
        for (int i = 0; i < position.length; i++) {
            currentPos = position[i];
            while ((currentPos - finalPos) >= 2) {
                currentPos -= 2;
            }
            while ((finalPos - currentPos) >= 2) {
                currentPos += 2;
            }
            if (((currentPos - finalPos) % 2 != 0) || ((finalPos - currentPos) % 2 != 0)) {
                if ((currentPos - finalPos) > 0) {
                    currentPos -= 1;
                    position[i] = currentPos;
                    cost++;
                }
                else if ((currentPos - finalPos) < 0) {
                    currentPos += 1;
                    position[i] = currentPos;
                    cost++;
                }
                else if ((currentPos - finalPos) == 0) {
                    position[i] = currentPos;
                }
            }
        }
        return cost;
    }
    public static int mostRepeated(int[] arr) {
        Arrays.sort(arr);
        int maxCount = 1;
        int currentCount = 1;
        int mostRepeated = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            }
            else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostRepeated = arr[i];
            }
        }
        return mostRepeated;
    }
}