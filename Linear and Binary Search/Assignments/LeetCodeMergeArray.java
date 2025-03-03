// LeetCodeMergeArray.java

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCodeMergeArray {
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
        mergeArray(nums1, m, nums2, n);
    }
    public static void mergeArray(int[] nums1, int n1, int[] nums2, int n2) {
        ArrayList<Integer> arr = new ArrayList<>(n1+n2);
        for (int i = 0; i < n1; i++) {
            arr.add(nums1[i]);
        }
        for (int i = 0; i < n2; i++) {
            arr.add(nums2[i]);
        }
        int[] arr1 = new int[arr.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        Arrays.sort(arr1);
        nums1 = arr1;
        System.out.println(Arrays.toString(nums1));
    }
}