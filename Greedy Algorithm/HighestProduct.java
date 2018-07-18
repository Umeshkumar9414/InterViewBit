//Que :- https://www.interviewbit.com/problems/highest-product/
public class Solution {
    public int maxp3(int[] a) {
        int i,j,k,n=a.length;
        int m1,m2,m3=Integer.MIN_VALUE,s1=1,s2=Integer.MAX_VALUE;
        m1=m2=m3;s1=s2;
        for(i=0;i<n;i++){
            if(a[i]>m3){
                if(a[i]>m2){
                    if(a[i]>m1){
                        m3=m2;
                        m2=m1;
                        m1=a[i];
                    }else{
                        m3=m2;
                        m2=a[i];
                    }
                }else{
                    m3=a[i];
                }
            }
            if(a[i]<s2){
                if(a[i]<s1){
                    s2=s1;
                    s1=a[i];
                }else{
                    s2=a[i];
                }
            }
        }
        return Math.max(m1*m2*m3,m1*s1*s2);
    }
}
