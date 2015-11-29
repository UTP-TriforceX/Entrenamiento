//1212 - Jingle Composing
//http://coj.uci.cu/24h/problem.xhtml?pid=1212

import java.io.*;
import java.util.*;

public class Main {
    public static double map(char x){
        if(x == 'W') return 1.0;
        if(x == 'H') return 1.0/2.0;
        if(x == 'Q') return 1.0/4.0;
        if(x == 'E') return 1.0/8.0;
        if(x == 'S') return 1.0/16.0;
        if(x == 'T') return 1.0/32.0;
        if(x == 'X') return 1.0/64.0;
        return 0.0;
    }
    
    public static void main(String[]args) throws IOException{
        String x, aux;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count;
        double sum;

        while(true){
            x = br.readLine();
            if(x.equals("*")) break;
            else{
                count = 0;
                st = new StringTokenizer(x, "/");
                while(st.hasMoreTokens()){
                    sum = 0.0;
                    aux = st.nextToken();
                    for(int i=0; i<aux.length(); i++){
                        sum += map(aux.charAt(i));
                    }
                    if(sum == 1.0) count++;
                }
                System.out.println(count);
            }
        }
    }
}