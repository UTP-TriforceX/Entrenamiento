//KNAPSACK - The Knapsack Problem
//http://www.spoj.com/problems/KNAPSACK/

import java.util.*;
import java.io.*;

public class Main{
    static int max_weight = 2001, max_n = 2001;
    static int [] prices, weigths;
    static int memo[][] = new int[max_n][max_weight];
    
    public static int knapsack(int ob, int weigth, int in){
        if(in == ob || weigth == 0) return 0;
        if(memo[in][weigth] != -1) return memo[in][weigth];
        int ans = -1;
        if(weigths[in] > weigth) ans = knapsack(ob, weigth, in+1);
        else{
            ans = Math.max( knapsack(ob, weigth, in+1), prices[in]+knapsack(ob, weigth - weigths[in], in+1));
        }
        return memo[in][weigth] = ans;
    }
    
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int s, n;
        
        for (int[] row: memo)
            Arrays.fill(row, -1);
    
        s = sc.nextInt(); n = sc.nextInt();
        prices = new int[n]; weigths = new int[n];
        for(int i=0; i<n; i++){
            weigths[i] = sc.nextInt(); 
            prices[i] = sc.nextInt();
        }
        System.out.println(knapsack(n, s, 0));
    }
}