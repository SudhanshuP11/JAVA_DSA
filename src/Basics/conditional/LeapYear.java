package Basics.conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year to check whether it's a leap year or not: ");
        int a = in.nextInt();

        if (a % 400 == 0) {
            System.out.println("Leap Year");
        } else if (a % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (a % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
