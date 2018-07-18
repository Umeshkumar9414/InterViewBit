//Que :- https://www.interviewbit.com/problems/distribute-candy/
public class Solution {
    public int candy(ArrayList<Integer> r) {
        int i,j,k,n=r.size();
        Integer a[]=new Integer[n];
        Arrays.fill(a,0);
        a[0]=1;
        for(i=1;i<n;i++){
            if(r.get(i)>r.get(i-1)){
                a[i]=a[i-1]+1;
            }else{
                a[i]=1;
            }
        }
        k=a[n-1];
        for(i=n-2;i>=0;i--){
            if(r.get(i)>r.get(i+1) && a[i]<=a[i+1]){
                a[i]=a[i+1]+1;
            }
            k+=a[i];
        }
        //System.out.println(new ArrayList<Integer>(Arrays.asList(a)));
        return k;
    }
}
