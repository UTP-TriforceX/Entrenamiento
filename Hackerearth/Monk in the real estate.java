//Monk in the real estate
//https://www.hackerearth.com/code-monk-graph-theory-i/algorithm/monk-in-the-real-estate/description/

import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    static boolean [] visited;
    
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t, e, x, y, max, count;
        t = sc.nextInt();
        for(int i=0; i<t; i++){
            max = 0; count = 0;
            visited = new boolean[10001];
            e = sc.nextInt();
            for(int j=0; j<e; j++){
                x = sc.nextInt(); y = sc.nextInt();
                if(x > max) max = x;
                if(y > max) max = y;
                visited[x] = true; visited[y] = true;
            }
            for(int j=0; j<=max; j++){
                if(visited[j]) count++;
            }
            System.out.println(count);
        }
    }
}
