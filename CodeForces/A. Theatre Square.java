//A. Theatre Square
//http://codeforces.com/problemset/problem/1/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        long n, m, a, ancho, alto;
        StringTokenizer b;
        
        try{
            x = br.readLine();
            
            b = new StringTokenizer(x);
            n = Long.valueOf(b.nextToken());
            m = Long.valueOf(b.nextToken());
            a = Long.valueOf(b.nextToken());
            
            if(n%a == 0){
                ancho = n/a;
            }
            else{
                ancho = (n/a) +1;
            }
            
            if(m%a == 0){
                alto = m/a;
            }
            else{
                alto = (m/a)+1;
            }
            
            System.out.println(alto*ancho);
            
        }catch(IOException ex){
            
        }
    }
}
