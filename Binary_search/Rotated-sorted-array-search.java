//https://www.interviewbit.com/problems/rotated-sorted-array-search/

public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int k) {
        int n=a.size(),s=0,e=n-1,m;
        if(a.get(0)>=a.get(n-1)){
            s=1;
            m=(s+e)>>1;
            while(s<=e){
                int aa=a.get(m-1),b=a.get(m);
                if(b<aa){
                    break;
                }else if(b<a.get(0)){
                    e=m-1;
                }else{
                    s=m+1;
                }
                m=(s+e)>>1;
            }
            if(k<=a.get(n-1)){
                s=m;e=n-1;
            }else{
                s=0;e=m-1;
            }
        }
          
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
        
        return -1;
    }
}
