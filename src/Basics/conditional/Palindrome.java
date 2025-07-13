package Basics.conditional;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. to check palindrome: ");
        int a = in.nextInt();
        int org=a;
        int b=0;
        while (a>0) {
            int temp = a % 10;
            b = b * 10 + temp;
            a = a / 10;
        }
        if(org==b){
            System.out.println("NO. is plaindrome: ");
        }else{
            System.out.println("No. is not palindrome: ");
        }
    }
}
