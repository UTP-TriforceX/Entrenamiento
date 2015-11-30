//2960 - Another Enclosed Region
//http://coj.uci.cu/24h/problem.xhtml?pid=2960

import java.io.*;
import java.util.*;

public class Main {    
    public static int Check(char x){
        if(x == 'A' || x == 'D' || x == 'O' || x == 'P' || x == 'Q' || x == 'R') return 1;
        if(x == 'B') return 2;
        return 0;
    }   
    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int count = 0;
        s = br.readLine();
        for(int i=0; i<s.length(); i++) count += Check(s.charAt(i));
        System.out.println(count);
    }       
}