//1238 - Factorial Again!
//http://coj.uci.cu/24h/problem.xhtml?pid=1238

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    public static void main(String [] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fac [] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        String x;
        
        try{
            while(true){
                x = br.readLine();
                int total = 0;
                int j = x.length();
                
                if(x.equals("0")){
                    break;
                }
                else{
                    for(int i=0; i<x.length(); i++){
                        total += ((x.charAt(i))-48) * fac[j];
                        j --;
                    }
                }
                System.out.println(total);
            }
            
        }catch (Exception ex){
        
        }
    }
}
