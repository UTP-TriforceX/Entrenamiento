//1116 - Ekka Dokka 
//http://lightoj.com/volume_showproblem.php?problem=1116

import java.io.*;

public class Main {   
    public static void main(String [] args) throws IOException{        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t, x;
        int size;
        
        t = br.readLine();
        for(int i=1; i<=Integer.valueOf(t); i++){
            x = br.readLine();
            
            x = Integer.toBinaryString(Integer.valueOf(x));
            size = x.length();
            x = x.replaceAll("1", "");
            
            if((size-x.length())%2 == 0){
                System.out.println("Case "+i+": even");
            }
            else System.out.println("Case "+i+": odd");
        }
    }
}