//1046 - Product Subsequence
//http://coj.uci.cu/24h/problem.xhtml?abb=1046

#include <bits/stdc++.h>

using namespace std;

int main(){
	vector<long> vec(1002);

	for(int i=0; i<=1001; i++){
		vec[i]=i*(i+1)*(i+2);
	}

	int t, a, b;
	long long total;

	cin>>t;
	for(int j=0; j<t; j++){
		total=0;
		cin>>a>>b;

		for(int i=a; i<=b; i++){
			total+=vec[i];
		}
		cout<<total%100<<endl;
	}

	return 0;
}