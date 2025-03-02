// KunalSixth.java

import java.util.Arrays;

public class KunalSixth {
    public static void main(String[] args) {
        // IDEA: Time Complexity

        // INFO: Time Complexity is basically the best possible amount of comparisons that need to be made, so the shortest amount.
        int[] arr = {1, 2, 3, 4, 5};
        
        // NOTE: EXAMPLE USING THE ARRAY ABOVE
        /*
        for (int num : arr) {
            if (num == 1) {
            return num
            }
        }
         */

        // NOTE: SAME EXAMPLE BUT USING LINEAR SEARCH

        int ans1 = linearSearchIndex(arr, 1);
        System.out.println(ans1); // Output: 0 

        int ans2 = linearSearchElement(arr, 1);
        System.out.println(ans2); // Output: 1

        boolean ans3 = linearSearchCheck(arr, 1);
        System.out.println(ans3);

        // INFO: In the example above, only 1 comparison was made because 1 was at the start of the index, and this also follows the time complexity O(1)
        // INFO: O(1) means that this case is when the loop only had to make one comparison, and this is the best case. However, O(n) is the worst case, where 'n' is the size of the array, meaning that the maximum amount of comparisons were made.
        
        // INFO: The best case is constant, meaning it is always O(1) and it is not affected by the size of the array. The best case can also be graphed by a constant line graph.
        // INFO: The worst case is O(n) where n is the size of the array, meaning that it the worst case is affected by the size of the array. The worst case can also be graphed by a linear graph.
        // NOTE: The worst case is when you cannot find the target element.

        // HACK: Question 1 for Linear Searching in Strings

        String name = "Zaid";
        char target = 'i';
        System.out.println(searchNotEnhanced(name, target)); // Output: true
        System.out.println(searchEnhanced(name, target)); // Output: true

        // INFO: Here is what 'toCharArray()' does.
        System.out.println(Arrays.toString(name.toCharArray())); // Output: [Z, a, i, d]

        // HACK: Question 2 for Linear Searching in a Range
        int[] arrr = {18, 12, -7, 3, 14, 28};
        int target1 = 3;
        System.out.println(linearSearchInRange(arrr, target1, 1, 4)); // Output: 3 // INFO: This code means to search for 'target1' in the array 'arr' between the indexes '1' and '4'.

        // HACK: Question 3 for Linear Searching to Find the Minimum Value
        int[] arr1 = {18, 12, -7, 3, 14, 28};
        System.out.println(minLinearSearch(arr1)); // Output: -7

        // HACK: Question 4 for Linear Searching in a 2D Array
        int[][] arrr1 = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target2 = 34;
        int[] ans = linearSearch2DArray(arrr1, target2);
        System.out.println(Arrays.toString(ans)); // Output: [2, 2]

        // HACK: Question 5 for Linear Searching in a 2D Array to Find the Maximum Value
        int[][] arr2 = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int max = linearSearch2DArrayMax(arr2);
        System.out.println(max); // Output: 99

        // HACK: Question 6 for Linear Searching in an Array to Find Numbers With an Even Number of Digits
        int[] arrr2 = {12, 345, 2, 6, 7896};
        System.out.println(linearSearchEven(arrr2)); // Output: 2
        System.out.println(linearSearchEvenBetter(arrr2)); // Output: 2
        // INFO: Both outputs are the same, and both programs work the exact same, but one is even simpler, better, uses less memory, and has a faster runtime which is why its better and more preferred.

        // HACK: Question 7 for Linear Searching in a 2D Array to Find the Bank Account of the Richest Person
        int [][] arr3 = {
            {2, 8, 7},
            {7, 1, 3},
            {1, 9, 5}
        };
        System.out.println(linearSearchMaximumWealth(arr3)); // Output: 17

        int [][] arrr3 = {
            {1, 5},
            {7, 3},
            {3, 5}
        };
        System.out.println(linearSearchMaximumWealth(arrr3)); // Output: 10

        int [][] arr4 = {
            {1, 2, 3},
            {3, 2, 1}
        };
        System.out.println(linearSearchMaximumWealth(arr4)); // Output 6
    }
    // IDEA: Linear Search

    // HACK: Linear Search Code for the Index
    // INFO: Aim of the search: Search for a specific element in the array. Return the index of the element if item is found. Otherwise, return '-1' if the item is not found.

    static int linearSearchIndex(int[] arr, int target) {
        if (arr.length == 0) { // If the array is empty, then it should already return '-1'.
            return -1;
        }
        // Otherwise, if the array is not empty, run a 'for' loop.
        for (int index = 0; index < arr.length; index++) {
            // For every index, check if the element is equal to the target.
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // If the entire loop runs, and nothing was returned yet, then that means the target is not in the array, and it should return '-1'.
    }
    
    // HACK: Linear Search Code for the Element
    // INFO: Aim of the search: Search for a specific element in the array. Return the element if item is found. Otherwise, return '-1' if the item is not found.

    static int linearSearchElement(int[] arr, int target) {
        if (arr.length == 0) { // If the array is empty, then it should already return Integer.MAX_VALUE.
            return Integer.MAX_VALUE; // NOTE: '-1' might be one of the elements, so now we return the max value.
        }
        // Otherwise, if the array is not empty, run a 'for' loop.
        for (int element : arr) { // INFO: We are not using anything regarding the index, so we can use an Enhanced 'for' loop.
            // For every index, check if the element is equal to the target.
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE; // NOTE: If the entire loop runs, and nothing was returned yet, then that means the target is not in the array, and it should return Integer.MAX_VALUE. (It should not return '-1' because that could be one of the elements.)
    }
        
    // HACK: Linear Search Code for Checking
    // INFO: Aim of the search: Search for a specific element in the array. Return the element if item is found. Otherwise, return '-1' if the item is not found.

    static boolean linearSearchCheck(int[] arr, int target) {
        if (arr.length == 0) { // If the array is empty, then it should already return false
            return false; // NOTE: We need to return a boolean now because we are only checking if the target is in the array.
        }
        // Otherwise, if the array is not empty, run a 'for' loop.
        for (int element : arr) { // INFO: We are not using anything regarding the index, so we can use an Enhanced 'for' loop.
            // For every index, check if the element is equal to the target.
            if (element == target) {
                return true;
            }
        }
        return false; // NOTE: If the entire loop runs, and nothing was returned yet, then that means the target is not in the array, and it should return false. (It should not return '-1' because the code should return a boolean.)
    }

    // IDEA: Linear Search Questions

    // HACK: Question 1: Linear Search in Strings
    static boolean searchNotEnhanced(String str, char target) { // This type is without using the Enhanced 'for' loop.
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchEnhanced(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char letter : str.toCharArray()) { // This makes the string into an array of elements of type 'char'.
            if (letter == target) {
                return true;
            }
        }
        return false;
    }

    // HACK: Question 2: Linear Search in Range
    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) { // If the array is empty, then it should already return '-1'.
            return -1;
        }
        // Otherwise, if the array is not empty, run a 'for' loop.
        for (int index = start; index <= end; index++) { // INFO: The only difference between this code and the original code for Linear Search is that instead of iterating over the entire loop, we make i = start and let it iterate till the max range which is end, so i <= end.
            // For every index, check if the element is equal to the target.
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // If the entire loop runs, and nothing was returned yet, then that means the target is not in the array, and it should return '-1'.
    }
// 2832
    // HACK: Question 3: Linear Search to Find Minimum Value
    static int minLinearSearch(int[] arr) { // Assume that arr.length != 0.
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // HACK: Question 4: Linear Search in a 2D Array
    static int[] linearSearch2DArray(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] {-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[col].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    // HACK: Question 5: Linear Searching in a 2D Array to Find the Maximum Value
    static int linearSearch2DArrayMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] arr1 : arr) {
            for (int element : arr1) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    // HACK: Question 6: Linear Searching in an Array to Find Numbers With an Even Number of Digits
    static int linearSearchEven(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static int findDigits(int num) {
        int count = 0;
        if (num == 0) return 1;
        if (num < 0) num *= -1;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    // BUG: linearSearchEven but we are using the better way, 'evenBetter' and 'findDigitsBetter'
    static int linearSearchEvenBetter(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenBetter(num)) {
                count++;
            }
        }
        return count;
    }

    // BUG: Simpler way to do the 'findDigits' Function
    static int findDigitsBetter(int num) {
        return (int)(Math.log10(num) + 1);
    }
    // INFO: Explanation for the Code Above:
    // INFO: First of all, the reason we do '+1' is because this gives the number of digits as if its an index, so starting from 0, but we want it starting from 1 so we add 1.
    // INFO: Basically, log10 makes it so that every time a number is multiplied by 10, it increases by 1.
    // INFO: So, log10(10) + 1 is 2 because there is 2 digits.
    // INFO: For example, log10(999) + 1 is 3, because log10(999) on the calculator is around 2.99999..., and we made it of type 'int', so it removes/truncates the decimal place, then we add 1 as explained above.

    static boolean even(int num) {
        int numberOfDigits = findDigits(num);
        return numberOfDigits % 2 == 0;
    }
    
    // BUG: Even Method Using Better 'findDigitsBetter'
    static boolean evenBetter(int num) {
        int numberOfDigits = findDigitsBetter(num);
        return numberOfDigits % 2 == 0;
    }

    // https://leetcode.com/problems/richest-customer-wealth/description/
    // HACK: Question 7: Linear Searching in a 2D Array to Find the Richest Bank Customer
    static int linearSearchMaximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int person1;
        for (int[] person : accounts) {
            for (int account : person) {
                sum += account;
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}