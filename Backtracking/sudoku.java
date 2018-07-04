//Que :- https://www.interviewbit.com/problems/sudoku/

public class Solution {
    static int[] find(ArrayList<ArrayList<Character>> a, int []in){
    //System.out.println("got "+a);
    int i=0,j=0,k;
    j=in[1];
    for(i=in[0];i<9;i++){
        for(;j<9;j++){
            
            if((char)a.get(i).get(j)=='.' ){
                break;
            }
        }
        if(j!=9){
            break;
        }
        j=0;
    }
    in[0]=i;
    in[1]=j;
    //System.out.println("got pos "+Arrays.toString(in));
    return in;
}
static boolean isRight(ArrayList<ArrayList<Character>> a,int []in,char v){
    int i,j,x=in[0]/3,y=in[1]/3;
     //   System.out.println("for "+in[0]+" "+in[1]+" "+x+" "+y);
    for(i=0;i<9;i++){
        if((char)a.get(i).get(in[1])==v){
            return false;
        }
    }
    for(i=0;i<9;i++){
        if((char)a.get(in[0]).get(i)==v){
            return false;
        }
    }
    int ii=3*x;int jj=3*y;
    x=ii+3;y=jj+3;
    
    for(i=ii;i<x;i++){
        for(j=jj;j<y;j++){
            if((char)a.get(i).get(j)==v){
                return false;
                
            }
        }
    }
    
    return true;
}
static boolean fill(ArrayList<ArrayList<Character>> a,int in[]){
    if(in[0]==9){
        return true;
    }
    
   // System.out.println("for "+in[0]+" "+in[1]+" "+a);
    
    char c='1';
    int next[]=new int[2];
    next[0]=in[0];
    next[1]=in[1]+1;
    if(next[1]==9){
        next[1]=0;
        next[0]++;
    }
    next=find(a,next);
    for(c='1';c<='9';c++){
        if(isRight(a,in,c)){
            a.get(in[0]).set(in[1],c);
            if(fill(a,next)){
                return true;
            }
            a.get(in[0]).set(in[1],'.');
        }
    }
    return false;
    
    
}
    
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
    int in[]=new int[2];in[0]=0;in[1]=0;
    in=find(a,in);
    
    if(in[0]<9)
    fill(a,in);
    
   // return a;
    }
}
