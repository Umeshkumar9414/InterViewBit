//Que :- https://www.interviewbit.com/problems/gas-station/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> a, final List<Integer> b) {
        int i,j,k=0,l=0,n=a.size(),an=0,r=0;
        for(i=n-1;i>=0;i--){
            k+=a.get(i);
            l+=b.get(i);
            r=r+(a.get(i)-b.get(i));
            if(r<0){
                r=0;
                an=i+1;
            }
        }
        if(k>=l)
        return an;
        return -1;
    }
}
