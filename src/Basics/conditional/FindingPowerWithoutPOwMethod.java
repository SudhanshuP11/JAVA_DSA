package Basics.conditional;

import java.util.Scanner;

public class FindingPowerWithoutPOwMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=in.nextInt();
        System.out.println("Enter the exponent: ");
        int b = in.nextInt();
        int temp=1;
        for (int i = 1; i <=b; i++) {
            temp=temp*a;
        }
        System.out.println(temp);
    }
}
