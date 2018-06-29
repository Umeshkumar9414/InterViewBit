//Que :- https://www.interviewbit.com/problems/sorted-insert-position/

public class Solution {
    public int searchInsert(ArrayList<Integer> a, int k) {
         int n=a.size(),s=0,e=n-1,m;
        m=(s+e)>>1;
        
        while(s<=e){
            if((int)a.get(m)<k){
                s=m+1;
            }else if((int)a.get(m)>k){
                e=m-1;
            }else{
                return m;
            }
            m=(s+e)>>1;
        }
        
        return s;
    }
}
