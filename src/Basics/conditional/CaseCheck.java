package Basics.conditional;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        char ch = sc.next().trim().charAt(0);
        if(ch >='a'&& ch<='z'){
            System.out.println("LoweCase");
        }
        else{
            System.out.println("Upper case");
        }
    }
}
