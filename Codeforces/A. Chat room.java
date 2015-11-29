//A. Chat room
//http://codeforces.com/contest/58/problem/A

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, x, y;
        
        try{
            boolean flag = true;
            int j = 0;
            y = br.readLine();

            x = "hello";

            for(int i=0; i<x.length(); i++){
                if(y.indexOf(String.valueOf(x.charAt(i)), j)<y.length() && y.indexOf(String.valueOf(x.charAt(i)), j)>=0){
                    j = y.indexOf(String.valueOf(x.charAt(i)), j)+1;
                }
                else{
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }catch(Exception ex){
            
        }
    }
}
