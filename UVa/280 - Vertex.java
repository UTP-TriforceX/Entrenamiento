//280 - Vertex
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=216

import java.io.*;
import java.util.*;

public class Main {  
    static boolean[] visited =  new boolean[100];
    static int AdjList[][] = new int[100][100];;
    static boolean flag = false;
    
    public static void dfs(int u, int n){
        if(!flag) {
            flag = true;
        }
        else visited[u] = true;
        
        for(int j=0; j<n; j++){
            if(AdjList[u][j] == 1 && !visited[j]){
                dfs(j, n);
            }   
        }
    }
    
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String y, n;
        StringTokenizer b;
        int cont, aux, ind;
        
        while(true){
            n = br.readLine();
            if(n.equals("0")) break;
            else{
                AdjList= new int[100][100];
                while(true){
                    y = br.readLine();
                    if(y.equals("0")) break;
                    else{
                        b = new StringTokenizer(y);
                        ind = Integer.valueOf(b.nextToken());
                        
                        while(b.hasMoreTokens()){
                            aux = Integer.valueOf(b.nextToken());
                            if(aux != 0){
                                AdjList[ind-1][aux-1] = 1;
                            }
                        }   
                    }    
                }
                y = br.readLine();
                b = new StringTokenizer(y);
                ind = Integer.valueOf(b.nextToken());
                        
                while(b.hasMoreTokens()){
                    aux = Integer.valueOf(b.nextToken());
                    flag = false;
                    visited = new boolean[100];
                    cont = 0;
                    String sol = "";
                    dfs(aux-1, Integer.valueOf(n));
                    
                    for(int j=0; j<Integer.valueOf(n); j++){
                        if(visited[j]){
                            continue;
                        }
                        else{ 
                            cont++;
                            sol = sol+String.valueOf(j+1)+" ";
                        }
                    } 
                    if(cont>=1)
                        System.out.println(cont+" "+sol.substring(0, sol.length()-1));
                    else System.out.println(cont);
                }
            }
        }
    }
}