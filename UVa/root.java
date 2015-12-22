//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=964

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static BigInteger squareRoot(BigInteger N) {
        int bitCount = (N.bitLength() - 1)/2;
        int aux = 0;

        BigInteger guess = BigInteger.ZERO;

        while(bitCount >= 0){
            guess = guess.flipBit(bitCount);
            aux = guess.multiply(guess).compareTo(N);
            if(aux < 0)
                bitCount--;
            else if(aux != 0){
                guess = guess.flipBit(bitCount);
                bitCount--;
            }
            else{
                break;
            }
        }
        return guess;
    }
    
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t;
        String x;
        t = sc.nextInt();
        BigInteger bi;
        for(int i=0; i<t; i++){
            bi = sc.nextBigInteger();
            System.out.println(squareRoot(bi));
            if(i<t-1) System.out.println("");
        }
    }
}
