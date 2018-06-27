// Que :- https://www.interviewbit.com/problems/colorful-number/
public class Solution {
    public int colorful(int A) {
        
        String s=String.valueOf(A);
         int i,j,n=s.length(),m;
         if(n==1){
             return 1;
         }
         int a[]=new int[n];
         boolean yes=false;
         HashSet<Integer> hs=new HashSet<Integer>();
         for(i=0;!yes && i<n;i++){
             a[i]=s.charAt(i)-'0';
             if(!hs.add(a[i])){
                 yes=true;
              //   System.out.println("ad "+a[i]);
             }
             if(a[i]==1){
                 yes=true; 
             }
         }
         for(i=0;!yes && i<n;i++){
             m=a[i];
             for(j=i+1;j<n;j++){
                 m*=a[j];
                 if(!hs.add(m)){
                 //    System.out.println("adding "+m+" "+i+" "+j+" "+a[i]+" "+a[j]);
                    yes=true;
                    break;
                }
             }
         }
         if(yes){
             return 0;
         }else{
             return 1;
         }
         
    }
}
