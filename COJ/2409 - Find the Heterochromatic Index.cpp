//2409 - Find the Heterochromatic Index
//http://coj.uci.cu/24h/problem.xhtml?abb=2409

#include <bits/stdc++.h>

using namespace std;

int main(){
	int i, j;
	string x;

	cin>>x;
	cin>>i>>j;

	cout<<x<<" "<<abs(i-j)<<endl;

	return 0;
}