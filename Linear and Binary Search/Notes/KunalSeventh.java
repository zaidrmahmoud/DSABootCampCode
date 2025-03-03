// KunalSeventh.java

public class KunalSeventh {
    public static void main(String[] args) {
        // INFO: Explanation of Binary Search: 
        // INFO: Find the middle element of a SORTED array. Middle element = (int)(Start Index + End Index)/2 
        // INFO: So in [1, 2, 3, 4, 5], 3 is the middle element at index 2. Same thing with [1, 2, 3, 4, 5, 6], 3 is the middle element at index 2.
        // INFO: Then compare, is your target smaller, larger, or equal to the middle element? If it is equal, then you have found your target.

        // INFO: If it is larger, then you look in a new range. First you need to find the new Start Index. This can be done by doing (Middle Index + 1).
        // INFO: After that, all you need to do is repeat the process by doing (Start Index + End Index)/2 which gives you the new middle index, and you repeat the checking process until your target is found. (Note that 'Start Index' here is Middle Index + 1)
        
        // INFO: If it is smaller, then you look in a new range. First you need to find the new End Index. This can be done by doing (Middle Index - 1).
        // INFO: After that, all you need to do is repeat the process by doing (Start Index + End Index)/2 which gives you the new middle index, and you repeat the checking process until your target is found. (Note that 'End Index' here is Middle Index - 1)
        
        // INFO: If Start Index becomes greater than End Index, then the target was not found in the Array.

        // HACK: Implementation of Binary Search to Find Index of Target
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearchIndex(arr, target);
        System.out.println(ans); // Output: 10

        // HACK: Implementation of Binary Search to Find Index of Target in an Order Agnostic Array
        int[] arr1 = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // Ascending
        int target1 = 22;
        int ans1 = binarySearchOrderAgnostic(arr1, target1);
        System.out.println(ans1); // Output: 10

        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3}; // Descending
        int target2 = 22;
        int ans2 = binarySearchOrderAgnostic(arr2, target2);
        System.out.println(ans2); // Output: 3
    }
    // IDEA: Binary Search
    
    // HACK: Binary Search to Find Index of Target
    static int binarySearchIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }

    // HACK: Binary Search When the Order is Agnostic (Meaning You Do Not Know if it is Ascending or Descending)
    static int binarySearchOrderAgnostic(int[] arr, int target) { // INFO: PLEASE NOTE THAT IT HAS TO BE ONE OF THEM FOR THIS TO WORK, EITHER ASCENDING OR DESCENDING
        int start = 0;
        int end = arr.length -1;

        boolean isAscending = arr[start] < arr[end]; // This checks if it is ascending or descending by checking if the first element is less than the last. If it is, then it is ascending, and vice versa. 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}