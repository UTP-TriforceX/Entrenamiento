//Palindromic Numbers
//https://www.hackerearth.com/problem/algorithm/palindromic-numbers-7/

import java.util.*;
import java.io.*;

public class Main{
    static int[] pal = new int [100001];
    
    public static boolean isPal(String x){
        String y;
        StringBuilder sb = new StringBuilder(x);
        sb.reverse();
        y = sb.toString();
        
        if(x.equals(y)) return true;
        return false;
    }
    
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n, a, b, count;
        
        pal[0] = 1;
        for(int i=1; i<pal.length; i++){
            if(isPal(String.valueOf(i))) pal[i] =  1;
            else pal[i] = 0;
        }
        
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            count = 0;
            a = sc.nextInt(); b = sc.nextInt();
            
            for(int j=a; j<=b; j++){
                count += pal[j];
            }
            System.out.println(count);
        }
    }
}