package Basics.conditional;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. it find its factorial: ");
        int n = in.nextInt();
        int fact=1;
        while (n>1){
            fact*=n;
            n--;
        }
        System.out.println(fact);
    }
}
