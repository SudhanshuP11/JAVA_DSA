package ArrayANDArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        //assending
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the no. of element: ");
        int n = in.nextInt();
         int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
