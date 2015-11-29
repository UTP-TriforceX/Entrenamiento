//1445 - What's Next?
//http://coj.uci.cu/24h/problem.xhtml?pid=1445

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        while(true){
            a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
            if(a == 0 && b == 0 && c == 0) break;
            else{
                if((b-a) == (c-b)){
                    System.out.println("AP "+(c+(c-b)));
                }
                else{
                    System.out.println("GP "+(c*(c/b)));
                }
            }
        }
    }
}