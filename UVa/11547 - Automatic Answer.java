//11547 - Automatic Answer
//http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2542

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s, n;
        int res;
        
        try{
            s = br.readLine();
            
            for(int i=0; i<Integer.valueOf(s); i++){
                res = 0;
                n = br.readLine();
                
                res = (((((Integer.valueOf(n)*567)/9)+7492)*235)/47)-498;                
                System.out.println(String.valueOf(res).charAt(String.valueOf(res).length()-2)); 
            }
            
                
        }catch(Exception ex){
            
        }
    }
}
