//Que :- https://www.interviewbit.com/problems/matrix-median/

public class Solution {
    static int searchInsert(ArrayList<Integer> a, int k) {
         int n=a.size(),s=0,e=n-1,m;
        m=(s+e)>>1;
        int an=-1;
        while(s<=e){
            if((int)a.get(m)<=k){
                s=m+1;
                an=m;
            }else if((int)a.get(m)>k){
                e=m-1;
            }
            m=(s+e)>>1;
        }
        
        return an+1;
    }
    
    public int findMedian(ArrayList<ArrayList<Integer>> a) {
    int n=a.size();
    if(n==0){
        return 0;
    }
    int i,j;
    int m=a.get(0).size();
    int s=a.get(0).get(0),e=a.get(0).get(m-1);
    for(i=1;i<n;i++){
        s=Math.min(s,a.get(i).get(0));
        e=Math.max(e,a.get(i).get(m-1));
    }
    //int an=s;
    int ta=(n*m+1)/2;
    while(s<=e){
        int mid=(s+e)>>1;
        int less=0;
        for(i=0;i<n;i++){
            less+=searchInsert(a.get(i),mid);
          //  System.out.printf("for %d in %d %d\n",mid,i,searchInsert(a.get(i),mid));
        }
        if(less<ta){
            s=mid+1;
        }else{
            e=mid-1;
        }
        
    }
    return s;
    }
}
