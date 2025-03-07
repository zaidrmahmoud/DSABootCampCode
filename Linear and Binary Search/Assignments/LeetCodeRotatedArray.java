// LeetCodeRotatedArray.java

public class LeetCodeRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchRotated(arr, target));

        int[] arr1 = {4,5,6,7,0,1,2};
        int target1 = 3;
        System.out.println(searchRotated(arr1, target1));
    }
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
        
            if (arr[mid] > arr[end]) {
            start = mid + 1;
            } 
            else {
                end = mid;
            }
        }
        return start; 
    }
    public static int searchRotated(int[] nums, int target) {
        int start;
        int end;
        if (target > nums[nums.length - 1]) {
            start = 0;
            end = findPivot(nums);
        }
        else {
            start = findPivot(nums);
            end = nums.length - 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}