// KunalFifth.java

import java.util.ArrayList;
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
        // IDEA: Arrays

        // First Way to Print: Using 'for' Loop
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        // Second Way to Print: Using Enhanced 'for' Loop
        for (int i : nums1) {
            System.out.print(i + " ");
        }

        // Third Way to Print: Using Arrays.toString() Method ( Best Way )
        System.out.println(Arrays.toString(nums1));

        // HACK: Mutable Arrays
        int[] values = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(values)); // OUTPUT: [10, 20, 30, 40, 50]
        change(values); // INFO: This will change the value of the first element of the array.
        System.out.println(Arrays.toString(values)); // OUTPUT: [99, 20, 30, 40, 50]

        // HACK: 2D Arrays
        int[][] arr2D = new int[3][3]; // INFO: Rows need to be declared, but columns don't have to be declared.
        System.out.println(arr2D.length); // This will give the number of rows.

        int[][] arrr2D = { // INFO: Column Number can vary from row to row.
            {1, 2, 3}, // 0th Index
            {4, 5, 6}, // 1st Index
            {7, 8, 9} // 2nd Index -> arrr2D[2] = {7, 8, 9}
        };

        // HACK: Initializing a 2D Array in 'for' Loop ( Input )
        for (int row = 0; row < arr2D.length; row++) {
            // Specifying the row
            for (int col = 0; col < arr2D[row].length; col++) {
                // Specifying the column
                System.out.print("Enter the value for arr2D[" + row + "][" + col + "]: ");
                arr2D[row][col] = in.nextInt();
            }
        }

        // HACK: Printing a 2D Array in 'for' Loop ( Output )
        for (int row = 0; row < arr2D.length; row++) {
            // Specifying the row
            for (int col = 0; col < arr2D[row].length; col++) {
                // Specifying the column
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }

        // HACK: Printing a 2D Array in the Simplest Way ( Arrays.toString() Method )
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // HACK: Printing a 2D Array Using Enhanced 'for' Loop
        for (int [] a : arr2D) {
            System.out.println(Arrays.toString(a));
        }

        // IDEA: ArrayLIsts

        // INFO: Syntax: ArrayList<datatype> listName = new ArrayList<datatype>(size);
        ArrayList<Integer> list = new ArrayList<>(10);

        // INFO: You can add as many as you want, even if you specified 10 at the start, you can add more or less
        list.add(10);
        list.add(20);

        System.out.println(list); // OUTPUT: [10, 20]
        System.out.println(list.contains(10)); // OUTPUT: true
        System.out.println(list.set(0, 99)); // INFO: This will replace the value at index 0 with 99.
        System.out.println(list.get(1)); // OUTPUT: 20
        list.add(30);
        System.out.println(list); // OUTPUT: [99, 20, 30]
        list.remove(2); // INFO: This will remove the element at index 2, so 30 will be removed.
        System.out.println(list); // OUTPUT: [99, 20]
        
        // HACK: ArrayList 'for' Loop Initialization
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            list.add(in.nextInt());
        }
        
        // HACK: ArrayList 'for' Loop Printing
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        /* Internal Working of an ArrayList:
         * 1. An Initial Size is created, let's say 10.
         * 2. When the size exceeds 10, a new array of double size is created, i.e., 20.
         * 3. All the elements are copied to the new array.
         * 4. The old array is deleted.
         */

        // HACK: Multi-Dimensional ArrayList
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // HACK: Initialization the Rows of a 2D ArrayList
        for (int row = 0; row < 3; row++) {
            list2D.add(new ArrayList<>());
        }
        // INFO: How the code above works:
        /*
         * 1. We Declared that there is 3 rows because we said row < 3.
         * 2. For each row, we added a new ArrayList.
         * 3. So, row 1 (Index 0), row 2 (Index 1), and row 3 (Index 2) are created.
         * 4. So, now each row has its own ArrayList.
         */

        // HACK: Initialization of the Elements of a 2D ArrayList
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter the value for list2D[" + row + "][" + col + "]: ");
                list2D.get(row).add(in.nextInt());
            }
        }
        // INFO: How the code above works:
        /*
         * 1. We are getting the row first.
         * 2. Then, we declared the columns for each row.
         * 3. In this example theres 3 columns because we said col < 3.
         * 4. For each row, we are adding the elements to the ArrayList.
         * 5. So, the first row will have 3 elements, the second row will have 3 elements, and the third row will have 3 elements.
         * 6. 'list2D.get(row).add(in.nextInt());' This will first get the row, then add an element to that row, and repeat this till the columns are filled.
         */

        // IDEA: Questions on Arrays and ArrayLists

        // NOTE: Q1. Swap Elements of an Array
        int[] arr1 = {10, 20, 30, 40, 50};
        swap(arr1, 1, 3);
        System.out.println(Arrays.toString(arr1)); // OUTPUT: [10, 40, 30, 20, 50]

        // NOTE: Q2. Maximum Element of an Array
        System.out.println(maxElement(arr1)); // OUTPUT: 50

        // NOTE: Q3. Maximum Element of an Array in a Range
        System.out.println(maxElementInRange(arr1, 1, 4)); // OUTPUT: 40

        // NOTE: Q4. Reverse an Array
        reverseArray(arr1); // INFO: This will reverse the array.
        System.out.println(Arrays.toString(arr1)); // OUTPUT: [50, 20, 30, 40, 10]

        // IDEA: Converting ArrayList To Array of Primitive Type

        ArrayList<Integer> array = new ArrayList<>(5); // Initialize the ArrayList
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        int[] arrr2 = new int[array.size()]; // Initialize an Array with the same length as the ArrayList
        for (int i = 0; i < arr.length; i++) { // Create a 'for' Loop for each element in the Array
            arrr2[i] = array.get(i); // Assign the Array element at index 'i' to the element at index 'i' in the ArrayList
        }
    }
    static void change(int[] arr) { // INFO: This function will change the value of the first element of the array.
        arr[0] = 99;
    }
    // NOTE: This is Question 1.
    static void swap(int[] arr, int index1, int index2) { 
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // NOTE: This is Question 2.
    static int maxElement(int[] arr) { // INFO: This is for the entire Array. 
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // NOTE: This is Question 3.
    static int maxElementInRange(int[] arr, int start, int end) { // INFO: This is for a specific range.
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // NOTE: This is Question 4.
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}