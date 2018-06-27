//Que :- https://www.interviewbit.com/problems/different-bits-sum-pairwise/
public class Solution {
    public int cntBits(ArrayList<Integer> a) {
        int b,i,l,n=a.size();
       b=32;long an=0,o;
       for(b=0;b<32;b++){
           o=0;
           for(i=0;i<n;i++){
               o+=(a.get(i)>>b)&1;
           }
           an=(an+o*(n-o))%1000000007;
       }
       an=(an<<1)%1000000007;
       return (int)an;
        
    }
}
