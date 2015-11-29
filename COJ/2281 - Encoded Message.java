//2281 - Encoded Message
//http://coj.uci.cu/24h/problem.xhtml?pid=2281

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, t;
        int matriz, n;
        
        try{
            t = br.readLine();
            
            for(int k=0; k<Integer.valueOf(t); k++){
                n = 0;
                a = br.readLine();
                matriz = (int) Math.sqrt((double) a.length());

                for(int j=1; j<=matriz; j++){
                    for(int i=1; i<=matriz; i++){
                        System.out.print(a.charAt(i*matriz-1-n));
                    }
                    n++;
                }
                System.out.println("");
            }
                
        }catch (Exception ex){
        
        }
    }
}
