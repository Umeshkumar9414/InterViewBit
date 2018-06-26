//Que :- https://www.interviewbit.com/problems/integer-to-roman/

public class Solution {
    public String intToRoman(int n) {
        StringBuffer an=new StringBuffer("");
        while(n>=1000){
            an.append("M");
            n-=1000;
        }
         if(n>=900){
             an.append("CM");
            n-=900;
         }
         if(n>=500){
            an.append("D");
            n-=500;
        }
         if(n>=400){
             an.append("CD");
            n-=400;
         }
         while(n>=100){
            an.append("C");
            n-=100;
        }
         if(n>=90){
             an.append("XC");
            n-=90;
         }
         if(n>=50){
            an.append("L");
            n-=50;
        }
         if(n>=40){
             an.append("XL");
            n-=40;
         }
         while(n>=10){
            an.append("X");
            n-=10;
        }
         if(n==9){
             an.append("IX");
             n=0;
         }
         if(n>=5)
             {
             an.append("V");
             n-=5;
         }
         if(n==4){
            an.append("IV");
             n=0;
         }
        while(n>=1){
            an.append("I");
            n-=1;
        }  
         return an.toString();
         
    }
}
