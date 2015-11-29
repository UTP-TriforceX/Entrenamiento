//11417 - GCD
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2412

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {  
    public static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x;
        
        while(true){
            x = br.readLine();
            if(x.equals("0")) break;
            else {
                int g=0;
                for(int i = 1; i<Integer.valueOf(x); i++){
                    for(int j=i+1;j<=Integer.valueOf(x); j++){
                        g += gcd(i,j);
                    }   
                }
                System.out.println(g);
            }
        }
    }
}
