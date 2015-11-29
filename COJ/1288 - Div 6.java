//1288 - Div 6
//http://coj.uci.cu/24h/problem.xhtml?abb=1288

import java.math.*;
import java.util.*;

public class div5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger("0");
		BigInteger seis = new BigInteger("6");
		BigInteger z = new BigInteger("0");
		int t;

		t=sc.nextInt();

		for(int i=0; i<t; i++){
			n=sc.nextBigInteger();

			z=n.mod(seis);

			if((BigInteger.ZERO.compareTo(z))==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}