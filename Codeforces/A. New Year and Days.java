//A. New Year and Days
//http://codeforces.com/contest/611/problem/A

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] day = {52, 52, 52, 52, 53, 53, 52};
        String x, y;
        int n;
        x = br.readLine();
        st = new StringTokenizer(x);
        n = Integer.valueOf(st.nextToken());
        st.nextToken();
        y = st.nextToken();
        
        if(y.equals("month")){
            int count = 0;
            for(int i=0; i<month.length; i++){
                if(month[i] >= n) count++;
            }
            System.out.println(count);
        }
        else System.out.println(day[n-1]);
    }
}
