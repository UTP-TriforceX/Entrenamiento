//B. Testing Robots
//http://codeforces.com/problemset/problem/606/B

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] mat = new int[501][501];
        //Scanner sc = new Scanner(System.in);
        int x, y, x0, y0, aux;
        String a, b;
        b = br.readLine();
        st = new StringTokenizer(b);
        x = Integer.valueOf(st.nextToken()); y = Integer.valueOf(st.nextToken()); x0 = Integer.valueOf(st.nextToken()); y0 = Integer.valueOf(st.nextToken());
        a = br.readLine();
        
        mat[x0][y0]++;
        aux = 1;
        System.out.print("1 ");
        for(int i=0; i<a.length(); i++){
            switch (a.charAt(i)) {
                case 'U':
                    if (x0 - 1 >= 1) x0--;
                    break;
                case 'D':
                    if (x0 + 1 <= x) x0++;
                    break;
                case 'L':
                    if (y0 - 1 >= 1) y0--;
                    break;
                case 'R':
                    if (y0 + 1 <= y) y0++;
                    break;
                default:
                    break;
            }
            if (i != a.length() - 1){
                if (mat[x0][y0] == 0){
                    aux++;
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            else System.out.println((x*y) - aux);
            
            mat[x0][y0] = 1;
        }
    
    }
}
