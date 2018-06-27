//Que :-https://www.interviewbit.com/problems/divide-integers/

public class Solution {
    public int divide(int a, int b) {
        
         int c=0;
        long an=0;
        boolean ng=false;
        long fn=a,sn=b;
        
        if(fn<0){
            ng=!ng;
            fn=Math.abs((long)a);
           // System.out.println("in "+ng+" "+fn);
        }
        if(sn<0){
            ng=!ng;
            sn=Math.abs((long)b);
          //  System.out.println("in 2 "+ng+" "+sn);
        }
        do{
            sn=sn<<1;
            c++;
        }while(fn>=sn);
        sn>>=1;c--;
        while(c>=0){
            if(fn>=sn){
                fn-=sn;
                an+=((long)1<<c);
            }
            sn>>=1;
            c--;
        }
        if(ng){
         //  System.out.println("in 3  "+an);
            an=-1*an;
           // System.out.println("in 3 "+ng+" "+an);
        }
        
        if(an>Integer.MAX_VALUE || an<Integer.MIN_VALUE){
               return Integer.MAX_VALUE;
           }
        return (int)an;
        
    }
}
