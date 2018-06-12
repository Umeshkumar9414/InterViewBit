//https://www.interviewbit.com/problems/painters-partition-problem/

public class Solution {
    public int paint(int k, int t, int[] a) {
            int i,j,l,n=a.length;
        long e=0,s=0,m;
        for(i=0;i<n;i++){
            e+=a[i];
            if(s<a[i])
            s=a[i];
        }
        if(k>=n){
            return (int)((s*t)%10000003);
        }
      //  System.out.println(s+" s and e "+e);
        m=(s+e)>>1;
        long pr=0,un=0,cn=0,an=-1;
        while(s<=e){
         //   System.out.println(m+ "is m for this loop ");
            pr=0;un=0;cn=0;
            for(i=0;i<n;i++){
                if(cn+a[i]>m){
                    pr++;
                    if(un<cn){
                        un=cn;
                    }
                    cn=a[i];
                }else{
                    cn+=a[i];
                }
                
            }
            if(cn!=0){
                if(un<cn){
                        un=cn;
                    }
                pr++;
            }
            if(pr>k){
                s=m+1;
            }else{
                an=un;
                e=un-1;
            }
            m=(s+e)>>1;
        }
        an=an%10000003;
        return (int)((an*t)%10000003);
        
        
        
    }
}
