//A. Watermelon
//http://codeforces.com/problemset/problem/4/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        try{
            s = br.readLine();
            
            if(Integer.valueOf(s)%2 == 0 && Integer.valueOf(s)>2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
                
        }catch(Exception ex){
            
        }
    }
}
