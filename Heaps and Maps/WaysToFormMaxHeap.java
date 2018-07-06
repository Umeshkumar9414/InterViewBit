// Que :- https://www.interviewbit.com/problems/ways-to-form-max-heap/
public class Solution {
    static int log[];
    static long dp[];
    static long nck[][];
    static int mod=1000000007;
    static long ncr(int n,int r){
        if(r>n)
            return 0;
        if(n<=1)
            return 1;
        if(r==0)
            return 1;
        if(nck[n][r]!=0){
            return nck[n][r];
        }
        long f=ncr(n-1,r-1)+ncr(n-1,r);
        return nck[n][r]=f%mod;
    }
    static int getLeft(int n){
        int h,l,el;
        h=log[n];
        l=1<<h;
        el=n-((1<<h)-1);
        if(el >=l/2){
            return ((1<<h)-1);
        }else{
            return ((1<<h)-1)-(l/2- el);
        }
    }
    static long ans(int n){
        if(n<2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int l=getLeft(n);
        long f=((((ncr(n-1,l)%mod)*(ans(l))%mod)%mod*(long)ans(n-1-l))%mod);
        return dp[n]=f;
    }
    public int solve(int n) {
        log=new int[n+1];
        dp=new long[n+1];
        nck=new long[n+1][n+1];
        Arrays.fill(dp,-1);
        int i,cp=1,cl=-1,j;
        for(i=1;i<=n;i++){
            if(i==cp){
                cp=cp<<1;
                cl++;
            }
            log[i]=cl;
        }
        //System.out.println(Arrays.toString(log));
        return (int)(ans(n)%mod);
        
    }
}
