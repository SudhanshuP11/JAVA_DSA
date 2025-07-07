package Basics.conditional;

import java.util.Scanner;

public class DigitOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Enter that digit to find the no. of occurance: ");
        int b= sc.nextInt();
        int count=0;
        while (a>0){
            int temp=a%10;
            if(temp==b){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
