// LeetCodeRotatedArrayDuplicates

public class LeetCodeRotatedArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 5, 6, 7, 7, 8, 8, 0, 0, 0, 0, 1, 2, 2, 3, 3};
        System.out.println(findPivotDuplicates(arr));
    }
    public static int findPivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else if (arr[mid] < arr[end]) {
                end = mid;
            }
            else {
                end--;
            }
        }
        return start;
    }
}
