//A. Ultra-Fast Mathematician
//http://codeforces.com/problemset/problem/61/A

#include <bits/stdc++.h>

using namespace std;

int main(){
	string x, y;

	cin>>x>>y;
	for(int i=0; i<x.length(); i++){
		if((x[i]=='0' && y[i]=='1') || (x[i]=='1' && y[i]=='0')){
			cout<<'1';
		}
		else{
			cout<<'0';
		}
	}

	return 0;
}