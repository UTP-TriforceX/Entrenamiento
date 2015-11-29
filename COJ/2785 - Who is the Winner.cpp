//2785 - Who is the Winner?

#include <bits/stdc++.h>

using namespace std;

int main(){
	float total=0;
	int n, x;

	scanf("%d", &n);

	for(int i=0; i<n; i++){
		scanf("%d", &x);
		total=x+total;
	}

	printf("%.2f", total/n);

	return 0;
}