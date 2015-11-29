//Chandu and Consecutive Letters
//https://www.hackerearth.com/code-monk-array-strings/algorithm/chandu-and-consecutive-letters/

import java.io.*;
import java.util.*;

public class Main {
    public static String out(String x){
        x = x.replaceAll(", ", "");
        x = x.replace("[", "");
        x = x.replace("]", "");
        return x;
    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector<Character> vec;
        String t, s;
        t = br.readLine();

        for(int i=0; i<Integer.valueOf(t); i++){
            vec = new Vector<Character>();
            s = br.readLine();
            vec.add(s.charAt(0));
            if(s.length()>1){
                for(int j=1; j<s.length(); j++){
                    if(s.charAt(j) != vec.get(vec.size()-1)) vec.add(s.charAt(j));
                }
            }
            System.out.println(out(vec.toString()));
        }
    }
}
