package ArrayANDArrayList;

import java.util.Scanner;
import java.util.Arrays;

public class TwD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of colums and rows of matrix: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] ans = new int[a][b];
        int n = ans.length;
        int [] ans1 =new int[n];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = in.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<ans[i].length;j++){
                sum+=ans[i][j];
            }
            ans1[i]=sum;
        }
        System.out.println(Arrays.toString(ans1));
    }
}