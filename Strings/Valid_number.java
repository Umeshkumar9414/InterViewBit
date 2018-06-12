// Que :-  https://www.interviewbit.com/problems/valid-number/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isNumber(final String s) {
        
        
        //s=t.trim();
        int n=s.length();
        if(s.charAt(n-1)!=' ' && (s.charAt(n-1)<'0' || s.charAt(n-1)>'9')){
            return 0;
        }
        double d=0;
        try{
            d=Double.parseDouble(s);
        }catch(Exception e){
            return 0;
        }
        int x=s.indexOf('e');
        if(x>0){
            if(s.charAt(x-1)>'9' || s.charAt(x-1)<'0')
            return 0;
        }
        return 1;
        
        
    }
}
