// Que :-  https://www.interviewbit.com/problems/single-number/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> a) {
         int an=0,n=a.size();
        
        for(int i=0;i<n;i++){
            an^=a.get(i);
        }
        return an;
    }
}
