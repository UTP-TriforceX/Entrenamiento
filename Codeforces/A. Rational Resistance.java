//A. Rational Resistance
//http://codeforces.com/problemset/problem/343/A

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        long x, y, aux, out = 0;
        x = sc.nextLong(); y = sc.nextLong();

        while(true) {
            out += (x / y);
            x = x % y;
            if(x == 0) break;
            aux = x;
            x = y; y = aux;
        }

        System.out.println(out);
    }
}
