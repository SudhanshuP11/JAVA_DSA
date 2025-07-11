package Basics.conditional;

import java.util.Scanner;

public class InputtillEnterZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter the no. : ");
            int n = in.nextInt();
            if(n==0){
                break;
            }
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
