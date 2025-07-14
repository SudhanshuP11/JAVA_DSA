package Basics.conditional;

import java.util.Scanner;

public class GCDHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int a= in.nextInt();
        int b= in.nextInt();

        int gcd=1;
//        for (int i = 1; i < Math.min(a,b); i++) {
//            if(a%i==0&&b%i==0){
//                gcd=i;
//            }
//        }
//        System.out.println("GCD is: " + gcd);
        //Euclidean Algorithm for GCD — Logic
        while(b!=0){
            int temp=b;
            b= a%b;
            a=temp;
        }
        System.out.println("GCD is: " + a);


    }
}
