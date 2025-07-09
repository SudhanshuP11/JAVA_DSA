package Basics.switchstatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String s = sc.next();

        switch (id){
            case 1:
                System.out.println("Hello 1");
                break;
            case 2:
                System.out.println("Hello 2");
                break;
            case 3:
                switch (s){
                    case "IT":
                        System.out.println("Hello Sudhanshu: ");
                        break;
                }
                break;
            default:
                System.out.println("heloo defaulr");
        }
    }
}
