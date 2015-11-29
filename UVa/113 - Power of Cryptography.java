//113 - Power of Cryptography
//http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=49

import java.util.*;

public class Prueba{
    public static void main(String[]args){
        double a, k;
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            a = sc.nextDouble();
            k = sc.nextDouble();
            
            a = 1.0 / a;
            
            System.out.println(Math.round(Math.pow(k, a)));
        }
    }
}