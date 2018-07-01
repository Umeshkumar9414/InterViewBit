// Que :- https://www.interviewbit.com/problems/anagrams/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
    int i,j,x,l,n=a.size();
    HashMap <String,Integer> hm=new HashMap <String,Integer>();
    ArrayList<ArrayList<Integer>> an=new ArrayList<ArrayList<Integer>>();
    for(i=0;i<n;i++){
        char c[]=a.get(i).toCharArray();
        Arrays.sort(c);
        String sb=new String(c);
        if(hm.get(sb)==null){
            x=an.size();
            hm.put(sb,x);
            an.add(new ArrayList<Integer>());
            an.get(x).add(i+1);
        }else{
            x=hm.get(sb);
            an.get(x).add(i+1);
        }
    }
    return an;
    }
}
