//1658 - Longest Increasing Subsequence (LIS)
//http://coj.uci.cu/24h/problem.xhtml?pid=1658

import java.util.*;

public class Main {
	public static int lis(int[] arr, int n) {
		int[] lis = new int[n];
		int i, j, max = 0;
		
		for (i = 0; i < n; i++) lis[i] = 1;
		
		for (i = 1; i <n ; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) lis[i] = lis[j] + 1;
			}
		}
		
		for (i = 0; i < n; i++) {
			if (max < lis[i]) max = lis[i];
		}
		
		return max;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	    int[] x;
	    int n, t;
	    t = sc.nextInt();
	    for (int j = 0; j < t; j++) {
			n = sc.nextInt();
			x = new int[n];
			
			for(int i = 0; i < n; i++) x[i] = sc.nextInt();
			System.out.println(lis(x, n));
	    }
	}
}
