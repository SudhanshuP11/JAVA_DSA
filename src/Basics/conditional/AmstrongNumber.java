package Basics.conditional;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=in.nextInt();
        int org=a;
        int org2=a;
        int count=0;
        while(a>0){
            int temp=a%10;
            count++;
            a=a/10;
        }
        int am=0;
        while (org>0){

            int temp1 =org%10;
            double p = Math.pow(temp1,count);
            int b= (int)p;
            am=am+b;
            org=org/10;
        }
//        System.out.println(am);
        if(org2==am){
            System.out.println("This is the amstrong number");
        }
        else{
            System.out.println("this is not amstrong no.");
        }
    }
}
