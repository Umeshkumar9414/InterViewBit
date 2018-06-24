// Que :- https://www.interviewbit.com/problems/find-permutation/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String s, int n) {
          int i,j,k,c,l;
         Integer a[]=new Integer[n];
         for(i=0;i<n;i++){
             a[i]=0;
         }
         if(s.charAt(0)=='I'){
             a[0]=0;
             i=1;
         }else{
             i=0;
             while(i<n-1 && s.charAt(i)=='D'){
                 i++;
             }
             a[0]=i;
             i++;
         }
         for(;i<n-1;i++){
             if(s.charAt(i)=='D'){
                 j=0;
                 k=i;
                 while(i<n-1 && s.charAt(i)=='D'){
                     j++;
                     i++;
                 }
                 a[k]=j;
             }
         }
       //  System.out.println(Arrays.toString(a));
        // StringBuilder an=new StringBuilder("");
         l=c=a[0]+1;
         //an.append(String.valueOf(c)+" ");
         a[0]=c;
         for(i=0;i<n-1;i++){
             if(s.charAt(i)=='I'){
                 c=l+a[i+1]+1;
                 l=c;
                 // an.append(String.valueOf(c)+" ");
                 a[i+1]=c;
             }else{
                 c--;
                 //an.append(String.valueOf(c)+" ");
                 a[i+1]=c;
             }
         }
         //System.out.println(Arrays.toString(a));
          ArrayList<Integer> x=new ArrayList<Integer>(Arrays.asList(a));
          return x;
    }
}
