package Leetcode.Basic.ARRAYANDARRAYLIST;

public class Ques1480 {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
