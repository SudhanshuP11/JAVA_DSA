package Basics.conditional;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = in.next().toLowerCase().charAt(0);
        if(ch>='a'&&ch<='z'){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Inputed character is vowel: ");
            }else{
                System.out.println("Iputed is Consonent: ");
            }
        }else {
            System.out.println("Input character only b/w A-Z");
        }
    }
}
