package ArrayANDArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayConcept {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the no. of row and column: ");
        int n = i.nextInt(); int m = i.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter element");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arr[j][k] = i.nextInt();
            }
            
        }
        System.out.println("Printing old method");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();

        }
        System.out.println("New print method");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
        for (int[] k :arr){
            System.out.println(Arrays.toString(k));
        }
        System.out.println("Hello");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Arrays.toString(arr[j]));
        }
    }
}
