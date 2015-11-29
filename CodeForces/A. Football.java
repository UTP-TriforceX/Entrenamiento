//A. Football
//http://codeforces.com/problemset/problem/43/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pruebas {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x, n;
        String [] foot = new String [4];
        boolean flag = false;
        
        for(int i=0; i<4; i++){
            foot[i] = "0";
        }

        try{
            n = br.readLine();
            
            for(int i=0; i<Integer.valueOf(n); i++){
                x = br.readLine();
                
                if(foot[0].equals("0") || foot[0].equals(x)){
                    foot[0] = x;
                    foot[1] = String.valueOf(Integer.valueOf(foot[1])+1);
                }
                else{
                    foot[2] = x;
                    foot[3] = String.valueOf(Integer.valueOf(foot[3])+1);
                }
            }
            
            if(Integer.valueOf(foot[1]) > Integer.valueOf(foot[3])){
                System.out.println(foot[0]);
            }
            else{
                if(Integer.valueOf(foot[1]) < Integer.valueOf(foot[3])){
                    System.out.println(foot[2]);
                }
                else{
                    System.out.println(foot[0]);
                }
            }
                      
        }catch(IOException ex){

        }	
    }
}