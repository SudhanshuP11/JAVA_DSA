package Basics.conditional;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to reverse: ");
        int a=sc.nextInt();
        int ans=0;
        while(a>0){
            int temp=a%10;
            ans= ans*10+temp;
            a=a/10;
        }
        System.out.println(ans);
    }
}
