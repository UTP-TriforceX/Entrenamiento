//I. Lottery
//http://codeforces.com/problemset/problem/589/I

import java.io.*;
import java.util.*;

public class Main {
    static int[] vec;
    
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int n, k, aux, sol = 0;
        n = sc.nextInt(); k = sc.nextInt();
        vec = new int[k];
        for(int i=0; i<n; i++){
            aux = sc.nextInt();
            vec[aux-1]++;
        }
        for(int i=0; i<k; i++){
            if(vec[i] > n/k) sol += vec[i] - n/k;
        }
        System.out.println(sol);
    }       
}