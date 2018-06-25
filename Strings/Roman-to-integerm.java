//Que :- https://www.interviewbit.com/problems/roman-to-integer/

public class Solution {
    public int romanToInt(String t ){
         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
         hm.put('I',1);
         hm.put('V',5);
         hm.put('X',10);
         hm.put('L',50);
         hm.put('C',100);
         hm.put('D',500);
         hm.put('M',1000);
         char c[]=t.toCharArray();
         int n=c.length,last=hm.get(c[0]);
         int an=last,i=1;
         
         while(i<n){
             int cc=hm.get(c[i]);
             if(last<cc){
                 an-=(last)<<1;
             }
             an+=cc;
             last=cc;
             i++;
         }
        return an;
    }
}
