package Basics.conditional;

import java.util.Scanner;

public class Printfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print its all factors: ");
        int n = sc.nextInt();
        int a =1;
        while(a<=n){
            if(n % a==0){
                System.out.print(a+" ");
            }
            a++;
        }

    }
}
