package Leetcode.Basic.ARRAYANDARRAYLIST;

public class Ques1512 {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        if(i<j){
                            count++;
                        }
                    }
                }

            }
            return count;
        }
    }
}
