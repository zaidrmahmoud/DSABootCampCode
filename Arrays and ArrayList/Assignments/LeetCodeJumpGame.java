// LeetCodeJumpGame.java

public class LeetCodeJumpGame {
    public boolean canJump(int[] nums) {
        int farthestIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(farthestIndex < i)   return false;
            farthestIndex = Math.max(farthestIndex, i + nums[i]);
            if(farthestIndex >= nums.length - 1)    return true;
        }
        return true; 
    }
}