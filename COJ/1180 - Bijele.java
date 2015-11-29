//1180 - Bijele
//http://coj.uci.cu/24h/problem.xhtml?pid=1180

import java.io.*;
import java.util.*;

public class Main {
    public static int[] chess(int[] x){
        int[] y = new int[6];
        y[0] = 1-x[0]; y[1] = 1-x[1]; y[2] = 2-x[2]; y[3] = 2-x[3]; y[4] = 2-x[4]; y[5] = 8-x[5];
        
        return y;
    }
    
    public static void display(int[] x){
        for(int i=0; i<5; i++) System.out.print(x[i]+" ");
        System.out.println(x[5]);
    }
    
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t;
        int [] x;
            
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            x = new int[6];
            for(int j=0; j<6; j++) x[j] = sc.nextInt();
            display(chess(x));
        }
    }
}