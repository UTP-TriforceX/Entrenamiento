//1070 - A Simple Calculation
//http://coj.uci.cu/24h/problem.xhtml?abb=1070

import java.util.*;

public class Prueba{
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        int cuadro[] = new int[101];
        int rectangulo[] = new int[101];
        
        cuadro[1] = 1;
        for(int i=2; i<=100; i++){
            cuadro[i] = (i*i)+cuadro[i-1];
        }
        
        rectangulo[1] = 1;
        for(int i=2; i<=100; i++){
            rectangulo[i] = (i*i*i)+rectangulo[i-1];
        }
        
        while(sc.hasNext()){
            n = sc.nextInt();
            
            System.out.println(cuadro[n]+" "+rectangulo[n]);
        }
    }
}