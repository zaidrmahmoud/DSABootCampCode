// LeetCodeGoodPairs.java

public class LeetCodeGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i] == nums[k]) goodPair++;
            }
        }
        return goodPair;
    }
}