//2144 - Ahorrando combustible
//http://coj.uci.cu/24h/problem.xhtml?pid=2144

import java.io.*;
import java.util.*;

public class Main {    
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t, n, d, aux, start, end;
        int[] vec;
        String x;
        t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            n = sc.nextInt(); d = sc.nextInt();
            aux = 0;
            vec = new int[n];
            x = sc.nextLine();
            for(int j=0; j<n; j++){
                vec[j] = sc.nextInt();
            }
            Arrays.sort(vec);
            if(x.equals(" regulate")){
                start = n - d;
                end = n;
            }
            else {
                start = 0;
                end = d;
            }
            for(int j=start; j< end; j++) aux += vec[j];
            System.out.println(aux);
        }
    }       
}