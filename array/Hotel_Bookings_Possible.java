public class Solution {
    public boolean hotel(ArrayList<Integer> ar, ArrayList<Integer> de, int k) {
         Integer a[]=ar.toArray(new Integer[ar.size()]);
         Integer b[]=de.toArray(new Integer[a.length]);
         Arrays.sort(a);
        Arrays.sort(b);
        int br=0,n=a.length,i,j;
        for(i=0,j=0;i<n&&j<n;){
            if(a[i]<b[j]){
                br++;
                i++;
            }else{
                br--;
                j++;
            }
            if(br>k){
                return false;
            }
        }
        return true;
    }
}
