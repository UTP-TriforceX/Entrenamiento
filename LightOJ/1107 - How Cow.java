//1107 - How Cow

import java.util.*;

public class Main{
	public static void main(String[]args){
		int t, m, x, y, x1, y1, x2, y2;
		Scanner sc=new Scanner(System.in);

		t=sc.nextInt();

		for(int i=1; i<=t; i++){
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();

			m=sc.nextInt();

			System.out.println("Case "+i+":");

			for(int j=1; j<=m; j++){
				x=sc.nextInt();
				y=sc.nextInt();

				if(((x>=x1)&&(x<=x2))&&((y>=y1)&&(y<=y2))){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
		}
	}
}