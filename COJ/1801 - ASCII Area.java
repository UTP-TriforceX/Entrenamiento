//1801 - ASCII Area
//http://coj.uci.cu/24h/problem.xhtml?abb=1801

import java.util.*;

public class Main {
    public static void main(String[]args){
       int h, w;
       double cont=0.0;
       boolean flag = false;
       String s;
       Scanner sc = new Scanner(System.in);
       
       h = sc.nextInt();
       w = sc.nextInt();
       
       for(int i=0; i<h; i++){
           s = sc.next();
           
           for(int j=0; j<w; j++){
               if((s.charAt(j)=='/' && !flag) || (s.charAt(j)=='\\' && !flag)){
                   cont += 0.5;
                   flag = true;
               }
               else{
                   if(s.charAt(j)=='.' && flag){
                         cont += 1.0;
                    }
                   else{
                       if((flag && s.charAt(j)=='\\') || (flag && s.charAt(j)=='/')){
                           cont += 0.5;
                           flag = false;
                       }
                   }
               }
           }
       }
       
       System.out.println((int)cont);
    }
}
