//Que :- https://www.interviewbit.com/problems/bulbs/
public class Solution {
    public int bulbs(int[] a) {
        int i,j,in=0,n=a.length,an=0;
        for(i=0;i<n;i++){
            if((a[i]+in)%2==0){
                an++;
                in=1-in;
            }
            
        }
        return an;
    }
}
