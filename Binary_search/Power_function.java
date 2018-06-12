//https://www.interviewbit.com/problems/implement-power-function/

public class Solution {
    public int pow(int x, int n, int d) {
        boolean neg=false;
        if(x<0){
            x=-1*x;
            if((n&1)==1){
                neg=true;
            }
        }
        if(x==1){
            if(neg){
                return (d-1);
            }else{
                return 1;
            }
        }
        if(x==0)
            return x;
        if(n==1){
            return x%d;
        }
        long r=1;
        while(n>0){
            if((n&1)==1){
                r=(r*x)%d;
            }
            x=(int)(((long)x*x)%d);
            n=n>>1;
        }
        if(neg){
            return (int)(d-r);
        }
        return (int)(r%d);
        
        
    }
}
