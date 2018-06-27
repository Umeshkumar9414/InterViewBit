//Que :- https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/

public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> a) {
        int i,j,k,n=a.size();
        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
        int ans=0,ane=0,s=0;
        hm.put(0,-1);
        for(i=0;i<n;i++){
            s+=a.get(i);
            if(hm.get(s)!=null){
                k=hm.get(s);
                //System.out.println(ans+" "+ane+" "+k+" "+i);
                if(i-k>ane-ans){
                    ans=k+1;
                    ane=i+1;
                }
                
            }
            if(hm.get(s)==null){
                hm.put(s,i);
            }
            
        }//System.out.println(ans+" "+ane);
        return new ArrayList<Integer>(a.subList(ans,ane));
    }
}
