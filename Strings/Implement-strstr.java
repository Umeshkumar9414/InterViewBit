//Que :- https://www.interviewbit.com/problems/implement-strstr/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String t, final String p) {
        int i=0,j,k,l,n=p.length(),m=t.length();
        if(n>m){
            return -1;
        }
        if(n==0){
            return 0;
        }
         int b[]=new int[n+1];
         b[0]=-1;
         j=-1;
         int an=-1;
         //preprocessing 
         while(i<n){
             while(j>=0 && p.charAt(i)!=p.charAt(j))j=b[j];
                 j++;
                 i++;
                 b[i]=j;      
         }
         i=0;
         j=0;
         while(i<m){
             while(j>=0 && t.charAt(i)!=p.charAt(j))j=b[j];
             i++;
             j++;
             if(j==n){
                an=i-j;
                 break;
             }
         }
         return an;
    }
}
