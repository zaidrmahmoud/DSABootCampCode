// LeetCodeRotateArray.java

public class LeetCodeRotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverseArray(nums);
        reverseArrayInRange(nums, 0, k - 1);
        reverseArrayInRange(nums, k, nums.length - 1);
    }
    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public void reverseArrayInRange(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}