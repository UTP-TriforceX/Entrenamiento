//2415 - Find the Wedding Cake Volume
//http://coj.uci.cu/24h/problem.xhtml?abb=2415

#include <bits/stdc++.h>;
#define PI 3.14159265358979323846

using namespace std;

int main(){
	int t, n, r, h;
	double total;
		
	cin>>t;
	for(int i=0; i<t; i++){
		total=0;
		cin>>n;
		
		for(int j=0; j<n; j++){
			cin>>r>>h;
			total+=(PI*pow(r,2)*h);
		}
		
		printf("%.2lf\n", total);
	}
	
	return 0;
}
