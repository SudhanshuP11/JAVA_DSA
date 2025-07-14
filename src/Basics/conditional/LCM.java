package Basics.conditional;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        //LCM(a,b)=
        //GCD(a,b)
        //LCM(a,b) = a*b/GCD;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int a= in.nextInt();
        int b= in.nextInt();
        int c=a;
        int d=b;
        while(b!=0){
            int temp=b;
            b= a%b;
            a=temp;
        }
        System.out.println("LCM is: "+(c*d)/a);
    }
}
