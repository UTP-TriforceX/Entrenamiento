//1354 - IP Checking.java
//http://lightoj.com/volume_showproblem.php?problem=1354

import java.util.*;

public class Main {
    public static int dec(String x){
        double j=0.0;
        int pow, total = 0;
        
        for(int i=x.length()-1; i>=0; i--){
            pow = (int)Math.pow(2.0, j);
            total += pow*((x.charAt(i))-48);
            j = j+1.0;
        }
        
        return (int)total;
    }
    
    public static void main(String[]args){
        Scanner ss = new Scanner(System.in);
        int t, n;
        String a, b, c;
        boolean flag;
        
        t = ss.nextInt();
        
        for(int i=1; i<=t; i++){
            flag = true;
            a = ss.next();
            b = ss.next();
            StringTokenizer str = new StringTokenizer(a, ".");
            StringTokenizer str1 = new StringTokenizer(b, ".");
            
            while(str.hasMoreElements()){
                if(Integer.parseInt(str.nextToken()) != dec(str1.nextToken())){
                    flag = false;
                }
            }
            
            if(flag){
                System.out.println("Case "+i+": Yes");
            }
            else{
                System.out.println("Case "+i+": No");
            }
        }
    }
}
