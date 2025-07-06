package ArrayANDArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //To Add element in ArrayList;
        System.out.println("Enter the no. of element in ArrayList: ");
        int n =sc.nextInt();
        for (int i = 0; i <n; i++) {
            list.add(sc.nextInt());
        }
        // To output-
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)+" ");

        }
    }
}
