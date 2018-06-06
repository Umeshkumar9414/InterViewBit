//Question link   
//https://www.interviewbit.com/problems/wave-array/

public class Solution {
    public int[] wave(int[] a) {
        int i,n=a.length;
        Arrays.sort(a);
        for(i=0;i<n-1;i++){
          //  System.out.println(i+" f ");
            a[i]=a[i]+a[i+1];
            a[i+1]=a[i]-a[i+1];
            a[i]=a[i]-a[i+1];
           // System.out.println(i+" a ");
            i++;
        }
        //for(i=0;i<n;i++){System.out.print(a[i]+" ");}
        return a;
        
    }
}
