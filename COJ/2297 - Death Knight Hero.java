//2297 - Death Knight Hero
//http://coj.uci.cu/24h/problem.xhtml?pid=2297

import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x, n;
        int count = 0;

        n = br.readLine();
        for(int i=0; i<Integer.valueOf(n); i++){
            x = br.readLine();
            if(x.indexOf("CD") < 0) count++;
        }
        System.out.println(count);
    }
}