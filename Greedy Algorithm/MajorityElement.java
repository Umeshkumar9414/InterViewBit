//Que :- https://www.interviewbit.com/problems/majority-element/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] a) {
        int i,j,k,n=a.length,c=1;
        k=a[0];
        c=1;
        for(i=1;i<n;i++){
            if(a[i]==k){
                c++;
            }else 
                c--;
            
            if(c==0){
                k=a[i];
                c=1;
            }
        }
        // if(c==0){
        //     k=a[n-1];
        // }
        return k;
        
    }
}
