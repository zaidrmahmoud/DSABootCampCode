
import java.util.Arrays;

// LeetCodeTwoSumII.java

public class LeetCodeTwoSumII {
    public static void main(String[] args) {
        int numbers[] ={-1, 0}; 
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            int start = i;
            int end = arr.length - 1;
            int tar;

            if (Math.abs(target) > arr[i]) {
                tar = Math.abs(target) - arr[i];
                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    if (tar < arr[mid]) {
                        end = mid - 1;
                    }
                    else if (tar > arr[mid]) {
                        start = mid + 1;
                    }
                    else {
                        int[] ans = {i + 1, mid + 1};
                        return ans;
                    }
                }
            }
            int[] ans = {0, 0};
            return ans;
        }
        int[] ansq = {0, 0};
        return ansq;
    }
}
