package Basics.conditional;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
     /*
     A Perfect Number is a positive integer that is equal to the sum of its proper divisors, excluding itself.
        For number 28:
        Divisors of 28 (excluding 28): 1, 2, 4, 7, 14
        Sum of divisors:
        1 + 2 + 4 + 7 + 14 = 28
        So, 28 is a Perfect Number.

      */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check its perfect number or not: ");
        int n = in.nextInt();
        int sum=0;
        for (int i = 1; i <=n/2 ; i++) {
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("Its a perfect number: ");
        }
        else {
            System.out.println("Its not a perfect number: ");
        }
    }
}
