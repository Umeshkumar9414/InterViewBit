//Que :- https://www.interviewbit.com/problems/rain-water-trapped/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> c) {
        int i,n=c.size();
        long an=0;
       // int a[]=new int[n];
        int b[]=new int[n];
        int a=-1;
        b[n-1]=-1;
        for(i=n-2;i>=0;i--){
            b[i]=Math.max(b[i+1],c.get(i+1));
        }
        //long an=0;
        for(i=1;i<n-1;i++){
            a=Math.max(a,c.get(i-1));
            int x=Math.min(a,b[i]);
            if(x<=c.get(i))
                continue;
            an+=(x-c.get(i));
        }
        return (int)an;
    }
}
