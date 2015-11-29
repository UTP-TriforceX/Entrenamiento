//2374 - Adding Numbers II
//http://coj.uci.cu/24h/problem.xhtml?pid=2374

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, x, y;
        StringTokenizer b;
        int min, max;
        
        try{
            a = br.readLine();
            b = new StringTokenizer(a);
            x = b.nextToken();
            y = b.nextToken();
            
            x = x.replaceAll("6", "5");
            y = y.replaceAll("6", "5");
            min = Integer.valueOf(x) + Integer.valueOf(y);
            
            x = x.replaceAll("5", "6");
            y = y.replaceAll("5", "6");
            max = Integer.valueOf(x) + Integer.valueOf(y);
            System.out.println(min+" "+max);
                
        }catch (Exception ex){
        
        }
    }
}
