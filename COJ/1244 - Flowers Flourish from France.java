//1244 - Flowers Flourish from France
//http://coj.uci.cu/24h/problem.xhtml?abb=1244

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        char ref;
        StringTokenizer a;
        boolean flag;
        
        try{
            while(true){
                s = br.readLine();
                
                if(s.equals("*")){
                    break;
                }
                else{
                    flag = true;
                    s = s.toLowerCase();
                    a = new StringTokenizer(s);
                    ref = s.charAt(0);
                    
                    while(a.hasMoreTokens()){
                        if(a.nextToken().charAt(0) != ref){
                            flag = false;
                            break;
                        }
                    }
                }
                
                if(flag){
                    System.out.println("Y");
                }
                else{
                    System.out.println("N");
                }
            }
        
        }catch (IOException ex){
         
        }
    }
}
