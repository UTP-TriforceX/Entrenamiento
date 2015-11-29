//1000 - Greetings from LightOJ
 
#include <bits/stdc++.h>

using namespace std;

int main(){
	int a,b,j,t;
	j=1;

  	scanf("%d",&t);
	while(t--){
   		scanf("%d %d",&a,&b);
   		printf("Case %d: %d\n",j,(a+b));
   		j++;
   	}
	return 0;
}