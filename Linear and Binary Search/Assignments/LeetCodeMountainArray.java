// LeetCodeMountainArray.java

public class LeetCodeMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        int[] arr1 = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray(arr1));

        int[] arr2 = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr2));
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = binarySearchInfinite(mountainArr, target, 0, peak);
        if (firstTry != 0) {
            return firstTry;
        }
        else {
            return binarySearchOrderAgnostic(mountainArr, target, peak + 1, mountainArr.length - 1);
        }


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
    public static int binarySearchInfinite(int[] arr, int target, int start, int end) {

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
        return -1;
    }
    public static int binarySearchOrderAgnostic(int[] arr, int target, int start, int end) { // INFO: PLEASE NOTE THAT IT HAS TO BE ONE OF THEM FOR THIS TO WORK, EITHER ASCENDING OR DESCENDING

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