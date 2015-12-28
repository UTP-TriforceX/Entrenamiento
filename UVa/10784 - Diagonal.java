//10784 - Diagonal
//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1725

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        long x;
        int count = 1;
       
        while(true){
            x = sc.nextLong();
            if(x == 0) break;
            else {
                System.out.println("Case "+count+": "+(int)(Math.ceil((3 + Math.sqrt(9 + 8 * x)) / 2)));
                count++;
            }
        }
    }
}
