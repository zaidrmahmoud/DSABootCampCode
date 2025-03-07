// LeetCodePeakMountain.java

public class LeetCodePeakMountain {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        int[] arr1 = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray(arr1));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}