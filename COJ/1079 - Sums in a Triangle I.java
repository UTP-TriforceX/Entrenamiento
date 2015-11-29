//1079 - Sums in a Triangle I
//http://coj.uci.cu/24h/problem.xhtml?pid=1079

import java.io.*;
import java.util.*;

public class Main {  
    static int memo[][] = new int[100][100]; 
    
    public static int dp(int n, int row, int col, Vector<Vector<Integer>> vec){
        if((row > (n-1)) || (col == vec.get(row).size() || col > (n-1))) return 0;
        if(memo[row][col] != -1) return memo[row][col];
        int ans = dp(n, row+1, col, vec);
        Vector<Integer> aux = vec.get(row);
        if(row<n){
            ans = Math.max(ans, dp(n, row+1, col+1, vec)) + aux.get(col);
        }
        else {
            ans = Math.max(ans, dp(n, row+1, col, vec))+ aux.get(col);
        }
        return memo[row][col] = ans;
    }
    
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Vector<Vector<Integer>> vec;
        Vector <Integer> a;
        int n, x, aux;
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            x = sc.nextInt();
            for (int[] row: memo) Arrays.fill(row, -1);
            vec = new Vector<Vector<Integer>>();
            for(int j=1; j<=x; j++){
                a = new Vector<Integer>();
                for(int k=0; k<j; k++){
                    aux = sc.nextInt();
                    a.add(aux);
                }
                vec.add(a);
            }  
            System.out.println(dp(x, 0, 0, vec));
        }
    }
}
