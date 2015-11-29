//1506 - Exam Grader
//http://coj.uci.cu/24h/problem.xhtml?pid=1506

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException{
        String t, x, n, y;
        double nota;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = br.readLine();
        x = br.readLine();
        n = br.readLine();

        for(int i=0; i<Integer.valueOf(n); i++){
            nota = 0.00;
            y = br.readLine();

            for(int j=0; j<Integer.valueOf(t); j++){
                if(y.charAt(j) == x.charAt(j)){
                    nota += 1.00;
                }
                else{
                    if(y.charAt(j) != '#'){
                        nota -= 0.25;
                    }
                }
            }
            System.out.printf(Locale.UK, "%.2f\n", nota);
        }

    }
}