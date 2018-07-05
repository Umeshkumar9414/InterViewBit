//Que:- https://www.interviewbit.com/problems/substring-concatenation/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findSubstring(String s, final List<String> a) {
    int n=a.size(),i,j,k;
    ArrayList<Integer> an=new ArrayList<Integer>();
    HashMap<String,Integer> hm =new HashMap<String,Integer>();
    for(i=0;i<n;i++){
        if(hm.get(a.get(i))==null){
            hm.put(a.get(i),1);    
        }else{
            hm.put(a.get(i),hm.get(a.get(i))+1);
        }
        
    }
    int l=a.get(0).length();
    HashMap<String,Integer> ht =new HashMap<String,Integer>();
    int m=s.length()-n*l;
    boolean go=true;
    for(i=0;i<=m;i++){
        ht.clear();
        k=0;go=true;
        j=i;
        while(go){
            String r=s.substring(j,j+l);
            if(hm.get(r)!=null && (ht.get(r)==null || ht.get(r)<hm.get(r))){
                k++;
                if(ht.get(r)==null )
                ht.put(r,1);
                else{
                    ht.put(r,ht.get(r)+1);
                }
            }else{
                go=false;
            }
            if(k==n){
                an.add(i);
                break;
            }
            j+=l;
            
        }
        
        
    }
    return an;
    
    }
}
