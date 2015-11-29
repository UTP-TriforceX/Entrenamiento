//11713 - Abstract Names
//http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2760

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n, a, b;
        
        try{
            n = br.readLine();
            
            for(int i=0; i<Integer.valueOf(n); i++){
                a = br.readLine();
                b = br.readLine();
                
                a = a.replaceAll("a",".");
                a = a.replaceAll("e",".");
                a = a.replaceAll("i",".");
                a = a.replaceAll("o",".");
                a = a.replaceAll("u",".");
                b = b.replaceAll("a",".");
                b = b.replaceAll("e",".");
                b = b.replaceAll("i",".");
                b = b.replaceAll("o",".");
                b = b.replaceAll("u",".");
            
                if(a.length() == b.length() && a.equals(b)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }  
            }
            
        }catch(Exception ex){
            
        }
    }
}
