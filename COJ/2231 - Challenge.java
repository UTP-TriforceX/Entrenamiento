//2231 - Challenge
//http://coj.uci.cu/24h/problem.xhtml?abb=2231

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Pruebas {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a;
        String b, x, y, n;
        int  conta = 0, contb = 0;
        
        try{
            n = br.readLine();
            for(int i=0; i<Integer.valueOf(n); i++){
                b = br.readLine();   
                a = new StringTokenizer(b);
                
                x = a.nextToken();
                y = a.nextToken();
                
                if(x.equals("rock") && y.equals("scissors")){
                    conta++;
                }
                else{
                    if(x.equals("rock") && y.equals("paper")){
                        contb++;
                    }
                    else{
                        if(x.equals("scissors") && y.equals("rock")){
                            contb++;
                        }
                        else{
                            if(x.equals("scissors") && y.equals("paper")){
                                conta++;
                            }
                            else{
                                if(x.equals("paper") && y.equals("scissors")){
                                    contb++;
                                }
                                else{
                                    if(x.equals("paper") && y.equals("rock")){
                                        conta++;
                                    }
                                    else{
                                        conta++;
                                        contb++;
                                    }
                                }
                            }
                        }
                    }
                }  
            }
            
            if(conta > contb){
                    System.out.println("A win");
                }
                else{
                    if(conta == contb){
                        System.out.println("tied");
                    }
                    else{
                        System.out.println("B win");
                    }
                }
            
        }catch (Exception ex){
        
        }
    }
}
