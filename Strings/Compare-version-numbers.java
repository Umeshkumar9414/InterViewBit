//Que : - https://www.interviewbit.com/problems/compare-version-numbers/
public class Solution {
    public int compareVersion(String t, String p) {
        
        int an=0,i,l,n,m;
        double j,k;
        t=t.trim();
        p=p.trim();
      //   System.out.println(t+" "+p);
         String a[]=t.split("\\.");
         String b[]=p.split("\\.");
         n=a.length;
         m=b.length;
         l=Math.max(n,m);
       //  System.out.println(n+" "+m);
         for(i=0;i<l;i++){
             j=0;k=0;
             if(i<n)
             j=Double.parseDouble(a[i]);
             if(i<m)
             k=Double.parseDouble(b[i]);
             if(j>k){
                 an=1;
                 break;
             }else if(j<k){
                 an=-1;
                 break;
             }
         }
         
         return an;
    }
}
