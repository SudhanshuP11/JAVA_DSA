package ArrayANDArrayList;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String to reverse: ");
        String s = in.next();
        char[] ch = s.toCharArray();
        String s2="";
        for (int i = ch.length-1; i >=0; i--) {
            s2=s2+ch[i];  // ch.length-1 bcause indexing start from 0 and if i do ch.length and ch[i] it will give indexout of bound
        }
        System.out.println(s2);

    }
}
