//Que :- https://www.interviewbit.com/problems/diffk/
public class Solution {
    public int diffPossible(ArrayList<Integer> a, int k) {
        int i=0,j=1,n=a.size();
        while(j<n){
            if(j==i){
                j++;
                continue;
            }
            if(a.get(j)-a.get(i)==k){
                return 1;
            }else if(a.get(j)-a.get(i)>k){
                i++;
            }else{
                j++;
            }
        }
       return 0;
    }
}
