package Leetcode.Basic;

import java.util.Scanner;

//1281. Subtract the Product and Sum of Digits of an Integer
public class Ques1281 {

    public static int subtractProductAndSum(int n) {
        int a=1,b=0;
        while(n>0){
            int temp = n%10;
            a=a*temp;
            b=b+temp;
            n=n/10;
        }
        int c = a-b;
        return c;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println(result);

    }

}
