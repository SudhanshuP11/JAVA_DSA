package ArrayANDArrayList;

import java.util.Scanner;

public class LargestElementinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of element in array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for (int i =0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int g =arr[0];
        for (int j=1;j< arr.length;j++){
            if(g<arr[j]){
                g=arr[j];
            }
        }
        System.out.println("The largest element in arr is: ");
        System.out.println(g);
    }
}
