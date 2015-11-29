//2746 - Flea´s Festival of Reading
//http://coj.uci.cu/24h/problem.xhtml?abb=2746

import java.util.*;

public class Pruebas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s;
        int mayus = 0;
        
        s = sc.next();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==65 || s.charAt(i)==69 || s.charAt(i)==73 || s.charAt(i)==79 || s.charAt(i)==85){
                mayus++;
            }
        }
        
        System.out.println(mayus+" "+(s.length()-mayus));
    }
}
