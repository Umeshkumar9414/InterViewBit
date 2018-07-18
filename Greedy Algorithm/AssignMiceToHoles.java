//Que: - https://www.interviewbit.com/problems/assign-mice-to-holes/
public class Solution {
    public int mice(int[] a, int[] b) {
        int i=0,n=a.length,an=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(i=0;i<n;i++){
            an=Math.max(Math.abs(a[i]-b[i]),an);
        }
        return an;
    }
}
