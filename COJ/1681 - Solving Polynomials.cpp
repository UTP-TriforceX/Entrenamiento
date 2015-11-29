//1681 - Solving Polynomials
//http://coj.uci.cu/24h/problem.xhtml?abb=1681

#include <bits/stdc++.h>

using namespace std;

int main(){
	int a, b, c;

	cin>>a>>b>>c;

	if((sqrt(pow(b,2)-(4*a*c)))>=0 && (a!=0)){
		cout<<"YES"<<endl;
	}
	else{
		cout<<"NO"<<endl;
	}

	return 0;
}