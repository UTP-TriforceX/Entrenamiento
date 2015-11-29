//Terrible Chandu
//https://www.hackerearth.com/code-monk-array-strings/algorithm/terrible-chandu/

import java.io.*;

public class Main {  
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        String t, s;
        t = br.readLine();
        
        for(int i=0; i<Integer.valueOf(t); i++){
            s = br.readLine();
            sb = new StringBuilder(s);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
