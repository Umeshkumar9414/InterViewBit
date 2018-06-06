//Question link
//https://www.interviewbit.com/problems/noble-integer/
public class Solution {
    public int solve(int[] a) {
        int i,n=a.length;
        Arrays.sort(a);
        for(i=0;i<n;i++){
            while(i+1<n && a[i]==a[i+1])
            i++;
            if(a[i]==(n-i-1))
            return 1;
        }
        return -1;
        
        
    }
}
