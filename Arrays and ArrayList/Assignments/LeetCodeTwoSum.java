// LeetCodeTwoSum.java



public class LeetCodeTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int addition = 0;

        outerLoop:
        for (int num = 0; num < nums.length; num++) {
            for (int i = num+1; i < nums.length; i++) {
                // add nums[num] to every nums[i]
                // if nums[num] + nums[i] == target, then answer[0] = nums[num] and answer[1] = nums[i]
                // break outerLoop
                addition = nums[num] + nums[i];
                if (addition == target) {
                    answer[0] = num;
                    answer[1] = i;
                    break outerLoop;
                }
                else addition = 0;

            }
        }
        return answer;
    }
}
