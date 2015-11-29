//1306 - Div 4
//http://coj.uci.cu/24h/problem.xhtml?abb=1306

import java.math.*;
import java.util.*;

public class main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger("0");
		BigInteger cuatro = new BigInteger("4");
		BigInteger z = new BigInteger("0");
		int t;

		t=sc.nextInt();

		for(int i=0; i<t; i++){
			n=sc.nextBigInteger();

			z=n.mod(cuatro);

			if((BigInteger.ZERO.compareTo(z))==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}