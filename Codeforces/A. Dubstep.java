//A. Dubstep
//http://codeforces.com/problemset/problem/208/A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n, k = "";
        StringTokenizer b;
        int aux, j;
              
        try{
            n = br.readLine();
            
            n = n.replaceAll("WUB", " ");
            b = new StringTokenizer(n);
            
            while(b.hasMoreTokens()){
                k = k+b.nextToken()+" ";
            }
            
            k = k.substring(0, k.length()-1);
            
            System.out.println(k);
  
        }catch(Exception ex){
            
        }
    }
}
