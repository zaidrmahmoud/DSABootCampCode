// KunalFifth.java

import java.util.Arrays;
import java.util.Scanner;

public class KunalFifth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // NOTE: Store Numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // NOTE: Easier way to store numbers is an Array
        
        // HACK: Array Declaration
        // datatype[] arrayName = new datatype[size];
        // datatype[] arrayName = {value1, value2, value3, ...};
        int[] numbers = new int[5];
        int[] numbers2 = {10, 20, 30, 40, 50};

        int[] nums; // INFO: Declaration of Array
        nums = new int[5]; // INFO: Initialization of Array

        System.out.println(nums[1]); // OUTPUT: 0 // INFO: By default, all elements in primitive arrays are initialized to 0 if the array is not initialized.

        String[] arr = new String[5]; // INFO: Array of Strings
        System.out.println(arr[1]); // OUTPUT: null // INFO: By default, all elements in a [String] array are initialized to null if the array is not initialized.
        
        // HACK: Array Initialization Using 'for' Loop
        int[] nums1 = new int[10];
        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Enter a number: ");
            nums1[i] = in.nextInt();
        }
        // IDEA: Ways to print an array

        // First Way: Using 'for' Loop
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        // Second Way: Using Enhanced 'for' Loop
        for (int i : nums1) {
            System.out.print(i + " ");
        }

        // Third Way: Using Arrays.toString() Method ( Best Way )
        System.out.println(Arrays.toString(nums1));

        // HACK: Mutable Arrays
        int[] values = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(values)); // OUTPUT: [10, 20, 30, 40, 50]
        change(values); // INFO: This will change the value of the first element of the array.
        System.out.println(Arrays.toString(values)); // OUTPUT: [99, 20, 30, 40, 50]

        // HACK: 2D Arrays
        int[][] arr2D = new int[3][]; // INFO: Rows need to be declared, but columns don't have to be declared.
        System.out.println(arr2D.length); // This will give the number of rows.

        int[][] arrr2D = { // INFO: Column Number can vary from row to row.
            {1, 2, 3}, // 0th Index
            {4, 5, 6}, // 1st Index
            {7, 8, 9} // 2nd Index -> arrr2D[2] = {7, 8, 9}
        };

        // HACK: Initializing a 2D Array in 'for' Loop
        for (int row = 0; row < arr2D.length; row++) {
            // Specifying the row
            for (int col = 0; col < arr2D[row].length; col++) {
                // Specifying the column
                arr2D[row][col] = in.nextInt();
            }
        }
    }
    static void change(int[] arr) { // INFO: This function will change the value of the first element of the array.
        arr[0] = 99;
    }
}