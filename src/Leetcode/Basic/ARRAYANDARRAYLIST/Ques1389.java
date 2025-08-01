package Leetcode.Basic.ARRAYANDARRAYLIST;

public class Ques1389 {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> res= new ArrayList<>(index.length);
            for(int i=0;i<nums.length;i++){
                res.add(index[i],nums[i]);
            }
            int[] arr = new int[res.size()];
            for(int i=0;i<res.size();i++){
                arr[i]= res.get(i);
            }
            return arr;

        }
    }
}
