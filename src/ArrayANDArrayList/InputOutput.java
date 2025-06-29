package ArrayANDArrayList;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
