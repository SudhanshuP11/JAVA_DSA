package Basics.switchstatement;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to check weekday or weekend: ");
        int n = sc.nextInt();
        switch (n){
            case 1,2,3,4,5-> System.out.println("WeekDays");
            case 6,7->System.out.println("Weekend: ");
            default -> System.out.println("Invalid No. input in range b/w 1-7:");

        }
    }
}
