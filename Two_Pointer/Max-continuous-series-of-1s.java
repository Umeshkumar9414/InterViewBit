// Que: - https://www.interviewbit.com/problems/max-continuous-series-of-1s/

public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> a, int m) {
    int n=a.size(),i,j,l=0;
    int lp=0,rp=0,k=0,ans=0,ane=0;
    while(rp<n){
        if(a.get(rp)==0) {
            k++;
        }
        if(k<=m  && l<(rp-lp+1)){
            ans=lp;
            ane=rp;
            l=rp-lp+1;
        }
        if(k>m){
            while(a.get(lp)==1){
                lp++; 
            }
            lp++;
            k--;
        }
        
        rp++;
    }
    //System.out.println(ans+" "+ane);
    ArrayList<Integer> x=new ArrayList<Integer>();
    for(i=ans;i<=ane;i++){
        x.add(i);
    }
    return x;
    }
}
