//Que :-https://www.interviewbit.com/problems/diffk-ii/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> a, int k) {
         HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        int i,j,n=a.size();
        for(i=0;i<n;i++){
          //  System.out.println("in");
            if(hm.get(a.get(i)-k)!=null || hm.get(a.get(i)+k)!=null){
                return 1;
            }
            hm.put(a.get(i),1);
           // System.out.println(hm);
        }
        return 0;
    }
}
