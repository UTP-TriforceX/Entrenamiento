//1225 - Palindromic Numbers (II) 
//http://lightoj.com/volume_showproblem.php?problem=1225

import java.io.*;
import java.util.*;

public class Main {   
    public static void main(String [] args) throws IOException{        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t, n;
        boolean flag;
        
        t = br.readLine();
        for(int i=1; i<=Integer.valueOf(t); i++){
            n = br.readLine();
            flag = true;
            
            if(n.length() == 1) flag = true;
            else{
                for(int j=0; j<=n.length()/2; j++){
                    if(n.charAt(j) != n.charAt(n.length()-1-j)){
                        flag = false;
                        break;
                    }
                }
            }
            
            if(flag) System.out.println("Case "+i+": Yes");
            else System.out.println("Case "+i+": No");
        }
    }
}