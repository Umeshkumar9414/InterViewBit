// Que :- https://www.interviewbit.com/problems/best-time-to-buy-and-sell-stocks-iii/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> a) {
        if(a.size()<2){
            return 0;
        }
        int i,j,k,n=a.size();
        int p[]=new int[n];
        int max=a.get(n-1);
        for(i=n-2;i>=0;i--){
            if(max<a.get(i)){
                max=a.get(i);
            }
                p[i]=Math.max(p[i+1],max-a.get(i));
            
        }
        int min=a.get(0);
        for(i=1;i<n;i++){
            if(min>a.get(i)){
                min=a.get(i);
            }
                p[i]=Math.max(p[i-1],p[i]+a.get(i)-min);
            
        }
        return p[n-1];
    }
}
