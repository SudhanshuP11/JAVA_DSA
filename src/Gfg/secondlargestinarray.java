package Gfg;

public class secondlargestinarray {
    class Solution {
        public int getSecondLargest(int[] arr) {
            // code here
            int largest = Integer.MIN_VALUE;
            int second= Integer.MIN_VALUE;
            for(int num:arr){
                if(num>largest){
                    second=largest;
                    largest=num;
                }
                else if(num>second && num<largest){
                    second=num;
                }
            }
            return (second==Integer.MIN_VALUE)?-1:second;

        }
    }
}
