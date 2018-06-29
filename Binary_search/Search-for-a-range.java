//Que :- https://www.interviewbit.com/problems/search-for-a-range/

public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int k) {
         int n=a.size(),s=0,e=n-1,m;
        m=(s+e)>>1;
        ArrayList<Integer> an=new ArrayList<Integer>();
        int min=-1,max=-1,lam=n-1;
        while(s<=e){
            if((int)a.get(m)<k){
                s=m+1;
            }else if((int)a.get(m)>k){
                lam=m;
                e=m-1;
            }else{
                min=m;
                e=m-1;
            }
            m=(s+e)>>1;
        }
        if(min==-1){
            an.add(-1);an.add(-1);
            return an;
        }
        s=min;e=lam;m=(s+e)>>1;
        while(s<=e){
            if((int)a.get(m)>k){
                e=m-1;
            }else{
                max=m;
                s=m+1;
            }
            m=(s+e)>>1;
        }
        an.add(min);
        an.add(max);
        return an;
        
    }
}
