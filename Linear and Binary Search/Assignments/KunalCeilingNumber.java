// KunalCeilingNumber.java

public class KunalCeilingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int tar = 1;
        System.out.println(ceilingOfNumber(nums, tar));
    }
    public static int ceilingOfNumber(int[] arr, int target) { // HACK: The aim of this code is to find the smallest number >= the target. So, if the target is 15, and its not in the array, then find the SMALLEST number that is >= 15. It must also return its index.
        int start = 0;
        int end = arr.length - 1;

        if (arr[end] < target) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}