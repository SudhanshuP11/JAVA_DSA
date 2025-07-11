package Basics.conditional;

import java.util.Scanner;

public class LargestNotillinputZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =1;
        System.out.println("Enter the no.: ");
        int b = sc.nextInt();
        int max=b;
        while(true){
            System.out.println("Enter the no.: ");
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(max<n) {
                max = n;
            }
        }
        System.out.println("Largest no. in your inputed no's. is: ");
        System.out.println(max);
    }
}
