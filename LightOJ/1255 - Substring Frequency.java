//1255 - Substring Frequency 
//http://lightoj.com/volume_showproblem.php?problem=1255

import java.io.*;
import java.util.*;

public class Main {
    public static int[] compute_prefix_function(char[] p){
        int[] pi = new int[p.length];
        pi[0] = -1;
        int k = -1;
        for(int i=1; i<p.length; i++){
            while(k>=0 && p[k+1] != p[i]) k=pi[k];
            if(p[k+1] == p[i]) k++;
            pi[i] = k;
        }
        return pi;
    }
    
    public static int KMP_Matcher(String pattern, String text){
        char[] p = pattern.toCharArray();
        char[] t = text.toCharArray();
        int[] pi = compute_prefix_function(p);
        int q = -1, count = 0;
        for (int i = 0; i < text.length(); i++) {
            while(q >= 0 && p[q+1] != t[i]) q = pi[q];
            if(p[q+1] == t[i]) {
                q++;
            }
            if(q == p.length -1){
                q = pi[q];
                count++;
            }
        }
        return count;
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t, x, y;
        t = br.readLine();

        for(int i=1; i<=Integer.valueOf(t); i++){
            x = br.readLine();
            y = br.readLine();
            System.out.println("Case "+i+": "+KMP_Matcher(y, x));
        }
    }
}
