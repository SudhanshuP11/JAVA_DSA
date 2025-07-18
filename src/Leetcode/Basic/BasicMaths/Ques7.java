package Leetcode.Basic.BasicMaths;

public class Ques7 {
    class Solution {
        public int reverse(int x) {
            // int a=x;
            // int ans=0;
            // int ans1=0;
            // if(x<0){
            //     int n=Math.abs(x);
            //     while(n>0){
            //     int temp=n%10;
            //     ans1 =ans1*10+temp;
            //     n=n/10;
            // }
            // return -ans1;
            // }
            // else{
            //     while(x>0){
            //     int temp=x%10;
            //     ans =ans*10+temp;
            //     x=x/10;
            // }
            // }
            // return ans;

            int ans=0;
            while(x!=0){
                int temp = x % 10;
                if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && temp > 7)) {
                    return 0;
                }
                if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE/10 && temp < -8)) {
                    return 0;
                }
                ans=ans*10+temp;
                x/=10;
            }
            return ans;
        }
    }
}
