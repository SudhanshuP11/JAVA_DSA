package Basics.conditional;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input from user till user doesenot press x or X
        int ans=0;
        while(true){
            //take operator as input
            System.out.println("Enter the operator: ");
            char op= sc.next().trim().charAt(0);
            if(op == '+' || op =='-'|| op == '*'|| op =='/' || op == '%'){
                //input two numbers
                System.out.println("Enter the two number: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op=='+'){
                    ans= a+b;
                }
                if(op=='-'){
                    ans= a-b;
                }
                if(op=='*'){
                    ans= a*b;
                }
                if(op=='/'){
                    ans= a/b;
                }
                if(op=='%'){
                    ans= a%b;
                }
            } else if (op=='x'||op=='X') {
                break;
            }
            else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
    }
}
