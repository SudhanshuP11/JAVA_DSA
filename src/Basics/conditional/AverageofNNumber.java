package Basics.conditional;

import java.util.Scanner;

public class AverageofNNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        double org=n;
        double sum=0;
        while(n>0){
            sum=sum+n;
            n--;
        }
        System.out.println(sum/org);
    }
}
