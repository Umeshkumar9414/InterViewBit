//Que :- https://www.interviewbit.com/problems/distinct-numbers-in-window/

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> a, int k) {
    ArrayList<Integer> an=new ArrayList<Integer> ();
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int i,j,l=0,n=a.size();
    if(k>n)
        return an;
    for(i=0;i<k;i++){
        j=a.get(i);
        if(hm.get(j)==null){
            hm.put(j,1);
        }else{
            hm.put(j,1+hm.get(j));
        }
    }
    an.add(hm.size());l=0;
    for(;i<n;i++,l++){
        j=a.get(i);
        if(hm.get(j)==null){
            hm.put(j,1);
        }else{
            hm.put(j,1+hm.get(j));
        }
        j=a.get(l);
        if(hm.get(j)==1){
            hm.remove(j);
        }else{
            hm.put(j,hm.get(j)-1);
        }
        an.add(hm.size());
    }
        
    return an;
    }
}
