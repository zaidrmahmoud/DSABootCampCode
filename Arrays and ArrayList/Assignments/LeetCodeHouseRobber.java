// LeetCodeHouseRobber.java



public class LeetCodeHouseRobber {
    public static void main(String[] args) {
        int[] house1 = {1, 2, 3, 1}; // Should return 4
        int[] house2 = {2, 7, 9, 3, 1}; // Should return 12
        int[] house3 = {2, 1, 1, 2, 1, 2}; // Should return 6
        int[] house4 = {2, 1, 1, 2}; // Should return 4
        System.out.println(rob(house1));
        System.out.println(rob(house2));
        System.out.println(rob(house3));
        System.out.println(rob(house4));
    }
    public static int rob(int[] houses) {
        int prev1=0,prev2=0;
        for(int num: houses){
            int current=Math.max(prev1,prev2+num);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}
