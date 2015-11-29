//1214 - Large Division
//http://lightoj.com/volume_showproblem.php?problem=1214

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t;
        String c, d;
        
        t = sc.nextInt();
        
        for(int i=1; i<=t; i++){
            c = sc.next();
            d = sc.next();
            BigInteger a = new BigInteger(c);
            BigInteger b = new BigInteger(d);
            
            if(a.remainder(b).compareTo(BigInteger.ZERO)==0){
                System.out.println("Case "+i+": divisible");
            }
            else{
                System.out.println("Case "+i+": not divisible");
            }
        }
    }
}
