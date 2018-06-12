//Que :-  https://www.interviewbit.com/problems/reverse-bits/


public class Solution {
    public long reverse(long a) {
        long b=0;
        for(int i=0;i<32;i++){
            b=b<<1;
            b|=(a&1);
            a=a>>1;
            
        }
        return b;
    }
}

