//package Leetcode.Basic.ARRAYANDARRAYLIST;
//
//public class ques1431 {
//    class Solution {
//        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//            List<Boolean> result = new ArrayList<>();
//            int g=candies[0];
//            for(int i=1;i<candies.length;i++){
//                if(g<candies[i]){
//                    g=candies[i];
//                }
//            }
//            for(int j=0;j<candies.length;j++){
//                if((candies[j]+extraCandies)>=g){
//                    result.add(true);
//                }
//                else
//                {
//                    result.add(false);
//                }
//            }
//            return result;
//        }
//    }
//}
