//1387 - Setu 
//http://lightoj.com/volume_showproblem.php?problem=1387

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {     
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sol;
        StringTokenizer st;
        String n, x, t;
        
        t = br.readLine();
        for(int i=1; i<=Integer.valueOf(t); i++){
            System.out.println("Case "+i+":");
            sol = 0;
            n = br.readLine();
            for(int j=0; j<Integer.valueOf(n); j++){
                x = br.readLine();
                if(x.equals("report")) System.out.println(sol);
                else{
                    st = new StringTokenizer(x);
                    st.nextToken();
                    sol += Long.valueOf(st.nextToken());
                }
            }
        }
    }
}
