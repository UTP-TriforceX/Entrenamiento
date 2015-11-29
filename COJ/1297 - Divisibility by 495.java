//1297 - Divisibility by 495
//http://coj.uci.cu/24h/problem.xhtml?abb=1297

import java.math.*;
import java.util.*;

public class Prueba{
    public static void main(String[]args){
        int t;
        String n = "";
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger("495");
        
        t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            n = sc.next();
            
            BigInteger z = new BigInteger(n);
            z = z.remainder(a);
            
            if(z.compareTo(BigInteger.ZERO)==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}