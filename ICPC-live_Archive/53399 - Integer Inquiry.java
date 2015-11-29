//5399 - Integer Inquiry
//https://icpcarchive.ecs.baylor.edu/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=3400&mosmsg=Submission+received+with+ID+1826999

import java.io.*;
import java.math.*;

public class Main { 
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x, t;
        BigInteger bi, sol = BigInteger.ZERO;
        
        while(true){
            x = br.readLine();
            if(x.equals("0")) break;
            else{
                bi = new BigInteger(x);
                sol = sol.add(bi);
            }
        }
        System.out.println(sol);
    }
}
