//https://www.interviewbit.com/problems/count-and-say/

public class Solution {
    public String countAndSay(int n) {
            String a=new String("1");
        //String last=a;
         StringBuilder last = new StringBuilder("1");
        int i,j,k,c,x;
        char ch;
        for(i=2;i<=n;i++){
            //String cu=new String("");
            StringBuilder cu = new StringBuilder("");
            for(j=0;j<last.length();){
                c=1;
                ch=last.charAt(j);
                x=last.length();
                while(j+c<x && last.charAt(j+c)==ch){
                    c++;
                }
                cu.append(String.valueOf(c)+ch);
                j=j+c;
              //  System.out.println(x+" is length i am at "+j);
            }
            last=cu; 
           // System.out.println(i+ "th String "+last);
        }
        return last.toString();
    }
}
