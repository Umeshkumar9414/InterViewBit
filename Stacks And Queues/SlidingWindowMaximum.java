//Que :- https://www.interviewbit.com/problems/sliding-window-maximum/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] a, int w) {
        int i,j,k,l,n=a.length;
        if(w>n){
            w=n;
        }
        l=n-w+1;
        TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
        for(i=0;i<w;i++){
            if(tm.get(a[i])==null)
                tm.put(a[i],1);
            else{
                tm.put(a[i],tm.get(a[i])+1);
            }
        }
        k=0;
        int an[]=new int[l];
        an[k++]=(int)tm.lastKey();
        while(i<n){
            if(tm.get(a[i])==null)
                tm.put(a[i],1);
            else{
                tm.put(a[i],tm.get(a[i])+1);
            }
            
            int f=tm.get(a[i-w]);
            if(f==1){
                tm.remove(a[i-w]);
            }else{
                tm.put(a[i-w],f-1);
            }
            an[k++]=(int)tm.lastKey();
            i++;
        }
        return an;
        
        
    }
}
