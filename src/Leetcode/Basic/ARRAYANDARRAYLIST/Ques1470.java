package Leetcode.Basic.ARRAYANDARRAYLIST;

public class Ques1470 {
    public int[] shuffle(int[] nums, int n) {
        int n1 = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;

    }
}
