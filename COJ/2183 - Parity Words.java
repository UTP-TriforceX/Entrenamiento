//2183 - Parity Words
//http://coj.uci.cu/24h/problem.xhtml?pid=2183 

import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x, t;
        int odd, even;
        
        t = br.readLine();
        for(int i=0; i<Integer.valueOf(t); i++){
            x = br.readLine();
            odd = 0; even = 0;
            for(int j=0; j<x.length(); j++){
                if(x.charAt(j)%2 == 0) even++;
                else odd++;
            }
            if(even>odd) System.out.println("Even");
            else System.out.println("Odd");
        }
    }
}