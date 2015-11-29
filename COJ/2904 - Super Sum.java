//2904 - Super Sum
//http://coj.uci.cu/24h/problem.xhtml?abb=2904

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[]args){
        int t;
        String s;
        Scanner sc = new Scanner(System.in);
        BigInteger z = new BigInteger("0");
        
        t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            s = sc.next();
            
            BigInteger x = new BigInteger(s);
            z = z.add(x);
        }
        
        System.out.println(z);    
    }
}
