//2148 - Quadratic Equations
//http://coj.uci.cu/24h/problem.xhtml?abb=2148

#include <bits/stdc++.h>

using namespace std;

int main(){
	int n, a, b, c;

	cin>>n;
	for(int i=0; i<n; i++){
		cin>>a>>b>>c;
		if((sqrt(pow(b,2)-(4*a*c)))>0){
			cout<<"SI"<<endl;
		}
		else{
			cout<<"NO"<<endl;
		}
	}

	return 0;
}