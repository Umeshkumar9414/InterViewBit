//Que :- https://www.interviewbit.com/problems/ways-to-decode/
public class Solution {
    public int numDecodings(String s) {
        
        int i,j,k,n=s.length();
        if(s.charAt(0)=='0')
            return 0;
        int d[]=new int[n+1];
        d[0]=1;d[1]=1;
        for(i=2;i<=n;i++){
            
            if(s.charAt(i-1)>'0'){
                d[i]+=d[i-1];
            }
            if(s.charAt(i-2)=='1' ||(s.charAt(i-2)=='2' && s.charAt(i-1)<'7')){
                d[i]+=d[i-2];
            }
        }
        return d[n];
    }
}
