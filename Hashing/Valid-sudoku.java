// Que :- https://www.interviewbit.com/problems/valid-sudoku/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> a) {
    int i,j,n=a.size();
    if(n!=9){
        return 0;
    }
    HashMap hb[][]= new HashMap[3][3];
    HashMap hc[][]=new HashMap[2][9];
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            hb[i][j]=new HashMap<Integer,Boolean>();
        }
    }
    for(i=0;i<9;i++){
        hc[0][i]=new HashMap<Integer,Boolean>();
        hc[1][i]=new HashMap<Integer,Boolean>();
    }
    for(i=0;i<n;i++){
        char c[]=a.get(i).trim().toCharArray();
        if(c.length!=9){
            return 0;
        }
        for(j=0;j<c.length;j++){
            int f=c[j]-'0';
            if(f>=0 && f<=9){
                if(hb[i/3][j/3].get(f)!=null || hc[0][i].get(f)!=null || hc[1][j].get(f)!=null){
                    return 0;
                }else{
                    hb[i/3][j/3].put(f,true);
                    hc[0][i].put(f,true);
                    hc[1][j].put(f,true);
                }
            }
        }
    }
    return 1;
    }
}
