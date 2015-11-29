//1293 - Powers of Two

import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		int n;
		BigInteger r= new BigInteger("0");
		BigInteger dos= new BigInteger("2");

		n=sc.nextInt();

		r=dos.pow(n);
		System.out.println(r);
	}
}