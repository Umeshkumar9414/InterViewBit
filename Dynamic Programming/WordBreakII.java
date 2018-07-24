//Que : - https://www.interviewbit.com/problems/word-break-ii/

public class Solution {
    static HashMap<String,Boolean> hm;
    static ArrayList an[];
    
    static ArrayList<String> find(String s){
        int n=s.length(),i,j;
        if(an[n].size()!=0){
            return an[n];
        }
        StringBuffer ss=new StringBuffer();
        ArrayList<String> co=new ArrayList<String>();
        
        for(i=0;i<n-1;i++){
            ss.append(s.charAt(i));
            if(hm.get(ss.toString())==null)
                continue;
            ArrayList<String>tmp=find(s.substring(i+1));
            for(j=0;j<tmp.size()-1;j++){
                co.add(ss+" "+tmp.get(j));
            }
        }
            ss.append(s.charAt(i));
            if(hm.get(ss.toString())!=null){
                co.add(ss+"");
            }
        co.add("-1");
        an[n]=co;
        return an[n];
        
    }

    public ArrayList<String> wordBreak(String s, ArrayList<String> a) {
         hm=new HashMap<String,Boolean>();
        int i,n=a.size(),m=s.length()+1;
        
        an=new ArrayList[m];
        for(i=0;i<n;i++){
            hm.put(a.get(i),true);
            
        }
        for(i=0;i<m;i++){
            an[i]=new ArrayList<String>();
        }
        
        ArrayList<String> xx=find(s);
        xx.remove(xx.size()-1);
        return xx;

    }
}
