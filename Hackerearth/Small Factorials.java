//Small Factorials
//https://www.hackerearth.com/problem/algorithm/small-factorials/

import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    static BigInteger[] fac = new BigInteger[101];
    
    public static void main(String [] args) throws IOException{
        BigInteger x;
        fac[0] = new BigInteger("1");
        
        for(int i=1; i<fac.length; i++){
            x = new BigInteger(String.valueOf(i));
            fac[i] = fac[i-1].multiply(x);
        }
        
        Scanner sc = new Scanner(System.in);
        int t, n;
        
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            n = sc.nextInt();
            System.out.println(fac[n]);
        }
    }
}