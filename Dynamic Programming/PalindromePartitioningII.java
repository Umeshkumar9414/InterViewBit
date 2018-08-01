//Que :- https://www.interviewbit.com/problems/palindrome-partitioning-ii/

public class Solution {
    public int minCut(String s) {
         int i,j,k,n=s.length(),l;
        int dp[][]=new int[n][n];
        for(l=2;l<=n;l++){
            for(i=0;i+l<=n;i++){
                j=i+l-1;
                dp[i][j]=n;
                if((l==2 || dp[i+1][j-1]==0)&& s.charAt(i)==s.charAt(j)){
                    dp[i][j]=0;
                }else
                for(k=i;k<j;k++){
                   dp[i][j] =Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+1);
                }
            }
        }
        return dp[0][n-1];
    }
}
