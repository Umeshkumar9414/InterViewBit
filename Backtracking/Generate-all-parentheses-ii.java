//Que :- https://www.interviewbit.com/problems/generate-all-parentheses-ii/

public class Solution {
    static ArrayList<String> ans;
    static void go(int o,int c,int n,StringBuffer t){
    int i;
    if(o==n){
        while(c!=o){
            t.append(')');
            c++;
        }
        ans.add(t.toString());
        return;
    }t.append('(');
    go(o+1,c,n,new StringBuffer(t));
    if(c<o){
        t.deleteCharAt(t.length()-1);
        t.append(')');
        go(o,c+1,n,new StringBuffer(t));
    }
    return;
    
    
        
}
    public ArrayList<String> generateParenthesis(int n) {
    ans=new ArrayList<String>();
    //String s=new Str//
    go(0,0,n,new StringBuffer(""));
    return ans;
    }
}
