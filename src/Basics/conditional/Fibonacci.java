package Basics.conditional;

import java.util.Scanner;

// find the nth fibonacci
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term up to print fibonacci: ");
        int n = sc.nextInt();
        int p=0,i=1;
        int count=2;
        while(count<=n){
            int temp = i;
            i=i+p;
            p=temp;
            count++;
        }
        System.out.println(i);

    }
}
