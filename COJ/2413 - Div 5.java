//2413 - Div 5
//http://coj.uci.cu/24h/problem.xhtml?pid=2413

import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s, t;
        t = br.readLine();

        for(int i=0; i<Integer.valueOf(t); i++){
            s = br.readLine();  

            if(s.charAt(s.length()-1) == '5' || s.charAt(s.length()-1) == '0') System.out.println("YES");
            else System.out.println("NO");
        }
    }
}