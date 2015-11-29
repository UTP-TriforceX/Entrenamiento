//2430 - Triangular Numbers

import java.util.*;
import java.math.BigInteger;

public class Main{
	public static int BinarySearch(BigInteger valueInf, BigInteger valueSup, BigInteger n){
		BigInteger m = new BigInteger("1");
		BigInteger fact1 = new BigInteger("1");
		BigInteger fact2 = new BigInteger("1");
		BigInteger triangularTemp = new BigInteger("1");
		BigInteger dos = new BigInteger("2");
		
		if(valueInf.compareTo(valueSup) > 0)
			return -1;
		else{
			m = valueInf.add(valueSup);
			m = m.divide(dos);
			fact1 = m;
			fact2 = m.add(BigInteger.ONE);

	        if (BigInteger.ZERO.compareTo(m.remainder(dos)) == 0)
	            fact1 = fact1.divide(dos);
	        else
	            fact2 = fact2.divide(dos);
	        
	        triangularTemp = fact1.multiply(fact2);
	        
	        if(triangularTemp.compareTo(n) == 0)
	        	return 1;
	        else{
	        	if(n.compareTo(triangularTemp) == 1)
	        		return BinarySearch(m.add(BigInteger.ONE), valueSup, n);
	        	else
	        		return BinarySearch(valueInf, m.subtract(BigInteger.ONE), n);
	        }
		}
	}

	public static void main(String[] args){
		BigInteger n = new BigInteger("0");
		BigInteger maxValor = new BigInteger("9000000000");
		Scanner sc = new Scanner(System.in);

	    do{
	    	n = sc.nextBigInteger();
	    	if(n.compareTo(BigInteger.ZERO) > 0){
		        if(BinarySearch(BigInteger.ONE, maxValor, n) == 1)
		            System.out.print("YES\n");
		        else
		            System.out.print("NO\n");
	    	}
	    }
	    while (n.compareTo(BigInteger.ZERO) > 0);
	}
}
