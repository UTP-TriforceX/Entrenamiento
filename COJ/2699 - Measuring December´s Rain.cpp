//2699 - Measuring December´s Rain
//http://coj.uci.cu/24h/problem.xhtml?abb=2699

#include <bits/stdc++.h>

using namespace std;

int main(){
	int n; 
	double total, promedio=0.0;

	for(int i=0; i<30; i++){
		scanf("%d", &n);

		promedio += n;
	}

	n = promedio;
	promedio = n/30.0;

	total = (double)n + promedio;

	printf("%.3f", total);

	return 0;
}