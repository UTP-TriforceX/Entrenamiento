//3375 - Las Frases de Naebbirac
//http://coj.uci.cu/24h/problem.xhtml?pid=3375

import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x, y, s, t;
        StringTokenizer st;
        t = br.readLine();
        int count;
        
        for(int i=0; i<Integer.valueOf(t); i++){
            s = br.readLine();
            count = 0;
            st = new StringTokenizer(s);
            x = st.nextToken(); y = st.nextToken();
            
            for(int j=0; j<x.length(); j++) if(x.charAt(j) == y.charAt(j)) count++;
            System.out.println(x.length() - count);
        }
    }       
}