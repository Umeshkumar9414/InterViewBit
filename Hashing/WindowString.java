//Que :- https://www.interviewbit.com/problems/window-string/

public class Solution {
    public String minWindow(String s, String t) {
    int i,f,k=0,m=t.length(),n=s.length();
    HashMap<Character,Integer> ht=new HashMap<Character,Integer>();
    HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
    char c='a';
    for(i=0;i<m;i++){
        c=t.charAt(i);
        if(ht.get(c)==null){
            ht.put(c,1);
            k++;
        }else{
            ht.put(c,ht.get(c)+1);
        }
    }
    int st=0,e=0,an=Integer.MAX_VALUE,ss=0;//dc=0;
    while(e<n){
         if(k==0){
                while(k==0){
                    c=s.charAt(st);
                    f=hs.get(c);
                    hs.put(c,f-1);
                    if(ht.get(c)!=null && f==ht.get(c)){
                        k++;
                    }
                    st++;
                }
                //an=Math.min(e-st+1,an);
                if(an>(e-st+1)){
                    ss=st-1;
                    an=e-st+1;
                }
                continue;
            }
        
        c=s.charAt(e);
        if(hs.get(c)==null){
            f=1;
        }else{
            f=hs.get(c)+1;
        }
        hs.put(c,f);
        if(ht.get(c)!=null && f==ht.get(c)){
            k--;
        }
        
        e++;
    }
    if(k==0){
                while(k==0){
                    c=s.charAt(st);
                    f=hs.get(c);
                    hs.put(c,f-1);
                    if(ht.get(c)!=null && f==ht.get(c)){
                        k++;
                    }
                    st++;
                }
                if(an>(e-st+1)){
                    ss=st-1;
                    an=e-st+1;
                }
                //continue;
            }
    if(an==Integer.MAX_VALUE){
        return new String("");
    }
    return s.substring(ss,ss+an);
    }
}
