package Leetcode.Basic.ARRAYANDARRAYLIST;

public class Ques1920 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }
}
