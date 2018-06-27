//Que :- https://www.interviewbit.com/problems/2-sum/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> a, int t) {
         ArrayList<Integer> an=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int i=0;
        for(i=0;i<a.size();i++){
            int f=a.get(i);
            if(hm.get(f)!=null){
                an.add(hm.get(f)+1);
                an.add(i+1);
                return an;
            }
            if(hm.get(t-f)==null)
                hm.put(t-f,i);
        }
        return an;
    }
}
