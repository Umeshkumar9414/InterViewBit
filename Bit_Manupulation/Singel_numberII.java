// Que  :- https://www.interviewbit.com/problems/single-number-ii/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> a) {
        int an=0,s=0,i,j,n=a.size();
        for(i=0;i<32;i++){
            s=0;
            for(j=0;j<n;j++){
                int f=a.get(j);
                f=f>>i;
                s+=(f&1);
                
            }
            if(s%3!=0){
                an|=(1<<i);
            }
        }
        return an;
    }
}
