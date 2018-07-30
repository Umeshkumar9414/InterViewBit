//Que: - https://www.interviewbit.com/problems/jump-game-array/

public class Solution {
    public int canJump(int[] a) {
        int i,j,k,n=a.length;
        if(n==0)
        return 1;
        k=a[0];
        for(i=1;i<n;i++){
            if(k<i){
                return 0;
            }
            else{
                k=Math.max(k,a[i]+i);
            }
            if(k>=n-1){
                return 1;
            }
        }
        if(k>=n-1){
            return 1;
        }
        return 0;
    }
}
