//623 - 500!
//http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=564

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[]args) throws IOException{
        BigInteger vec[] = new BigInteger[1001];
        vec[0] = new BigInteger("1");
        vec[1] = new BigInteger("1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        try{
            for(int i=2; i<=1000; i++){
                vec[i] = vec[i-1].multiply(BigInteger.valueOf(i));
            }
            
            while(true){
                s = br.readLine();
                if(s.length() == 0 && s.equals("")){
                    break;
                }
                else{
                    System.out.println(s+"!");
                    System.out.println(vec[Integer.valueOf(s)]);
                }
            }
            
                
        }catch(Exception ex){
            
        }
    }
}
