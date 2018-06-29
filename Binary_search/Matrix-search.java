//QUe :- https://www.interviewbit.com/problems/matrix-search/

public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int k) {
        if(a.size()==0){
            return 0;
        }
        int n=a.size(),m=a.get(0).size(),s=0,e=n-1;
        m=(s+e)>>1;int an=0;
        while(s<=e){
            if(a.get(m).get(0)<=k){
                an=m;
                s=m+1;
            }else{
                e=m-1;
            }
            m=(s+e)>>1;
        }
      //  System.out.println(an);
        s=0;
        e=a.get(an).size()-1;
        m=(s+e)>>1;
        while(s<=e){
            if(a.get(an).get(m)<k){
                s=m+1;
            }else if(a.get(an).get(m)>k){
                e=m-1;
            }else{
                return 1;
            }
            m=(s+e)>>1;
        }
        return 0;
    }
}
