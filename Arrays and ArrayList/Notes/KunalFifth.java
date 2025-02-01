// KunalFifth.java

public class KunalFifth {
    public static void main(String[] args) {
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

    }
}