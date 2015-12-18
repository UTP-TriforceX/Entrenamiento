//B. Borze
//http://codeforces.com/problemset/problem/32/B

import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x, y = "";
        x = br.readLine();
        
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) == '.'){
                y += '0';
            }
            else if(i < x.length()-1 && x.charAt(i) == '-' && x.charAt(i+1) == '.'){
                i++;
                y += '1';
            }
            else if(i < x.length()-1 && x.charAt(i) == '-' && x.charAt(i+1) == '-'){
                i++;
                y += '2';
            }
        }
        System.out.println(y);
    }       
}
