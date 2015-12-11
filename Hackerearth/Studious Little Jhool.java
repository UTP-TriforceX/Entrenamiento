//Studious Little Jhool!
//https://www.hackerearth.com/problem/algorithm/studious-little-jhool/description/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t, n, rest, result, min;
        boolean flag;
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            result = 0;
            flag = false;
            min = 1000000;
            n = sc.nextInt();
            int j = 0;
            rest = 0;
            
            while(j*10 <= n){
                rest = n-(j*10);
                
                if(rest%12 == 0){
                    flag = true;
                    result = j+(rest/12);
                    if(result < min) min = result;
                }
                j++;
            }
            
            if(flag) System.out.println(min);
            else System.out.println("-1");
        }
    }
}
