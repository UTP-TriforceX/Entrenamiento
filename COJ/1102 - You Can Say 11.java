//1102 - You Can Say 11

import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[]args){
		
        BigInteger n = new BigInteger("0");
        BigInteger once = new BigInteger("11");
        Scanner sc = new Scanner(System.in);
               
        while (true) {
            n = sc.nextBigInteger();
            
            if (n.compareTo(BigInteger.ZERO)==0)
                break;
                       
            BigInteger mod[] = n.divideAndRemainder(once);

            if (mod[1].compareTo(BigInteger.ZERO)==0){
                System.out.println(n + " is a multiple of 11.");
            }
            else{
                System.out.println(n + " is not a multiple of 11.");
            }
        }
	}
}