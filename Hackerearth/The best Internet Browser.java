//The best Internet Browser
//https://www.hackerearth.com/problem/algorithm/the-best-internet-browser-3/

import java.util.*;
import java.io.*;

public class Main{
    public static int Vowel(String x){
        int count = 0;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tc, x;
        int size;
        tc = br.readLine();
        
        for(int i=0; i<Integer.valueOf(tc); i++){
            size = 0;
            x = br.readLine();
            size = x.length();
            x = x.replace("www.", "");

            x = x.substring(0, x.length()-4);
            
            System.out.println((size-Vowel(x)-4)+"/"+size);
        }
    }
}