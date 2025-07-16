package Leetcode.Basic.ARRAYANDARRAYLIST;

public class Ques1672 {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int[] ans= new int[n];
        int temp=1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            ans[i]=sum;

        }
        for(int k = 0; k < ans.length; k++){
            if(ans[k] > temp){
                temp = ans[k];
            }
        }
        return temp;
    }
}
