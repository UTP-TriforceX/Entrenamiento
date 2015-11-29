//713 - Adding Reversed Numbers
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=654

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {     
    public static int index(String x) {
        int ind=0;
        
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) != '0'){
                ind = i;
                break;
            }
        }
        return ind;
    }
    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb;
        BigInteger a, b;
        StringTokenizer st;
        String n, x, y, z;
        
        n = br.readLine();
        
        for(int i=0; i<Integer.valueOf(n); i++){
            x = br.readLine();
            st = new StringTokenizer(x);
            y = st.nextToken(); z = st.nextToken();
            sb = new StringBuffer(y);
            a = new BigInteger(sb.reverse().toString());
            sb = new StringBuffer(z);
            b = new BigInteger(sb.reverse().toString());
            a = a.add(b);
            
            sb = new StringBuffer(a.toString());
            x = sb.reverse().toString();
            System.out.println(x.substring(index(x)));
        }
    }
}
