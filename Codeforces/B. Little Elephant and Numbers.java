//B. Little Elephant and Numbers
//http://codeforces.com/problemset/problem/221/B

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static boolean isTrue(String x, String y){
        for(int i=0; i<x.length(); i++){
            if(y.contains(String.valueOf(x.charAt(i)))) return true;
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        n = sc.nextInt();
        String x;
        
        for (int i=1; i*i<=n; i++) {
            if (n%i == 0) {
                x = String.valueOf(i);
                if(isTrue(String.valueOf(n), x)) count++;
                //System.out.println(i);
                if(i*i < n) {
                    //System.out.println((n/i));
                    x = String.valueOf(n/i);
                    if(isTrue(String.valueOf(n), x)) count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
