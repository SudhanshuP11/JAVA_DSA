package Basics.conditional;

import java.util.Scanner;

public class Distancebw2point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two cordinate of 1st point 1: X1 Y1: ");
        double x1 = in.nextDouble();
        double y1=in.nextDouble();
        System.out.println("Enter the two cordinate of 2nd point 1: X2 Y2:");
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        double a=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double result = Math.sqrt(a);
        System.out.println(result);
    }
}
