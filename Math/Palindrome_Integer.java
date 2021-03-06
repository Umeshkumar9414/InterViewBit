//Question link
//https://www.interviewbit.com/problems/palindrome-integer/
//Determine whether an integer is a palindrome. Do this without extra space.

//A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
//Negative numbers are not palindromic.

public class Solution {
    public int isPalindrome(int a) {
        int t;
        t=0;
        if(a%10==0 && a!=0){
            return 0;
        }
        while(a>=t){
            t=10*t+a%10;
            if(t==a)
            return 1;
            a=a/10;
            if(t==a)
            return 1;
        }
        return 0;
        
    }
}
