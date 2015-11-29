//2698 - A+B=C

#include <bits/stdc++.h>

using namespace std;

int main(){
	int total=0;
	string x;
	cin>>x;

	for(int i=0; i<x.length(); i++){
		total+=x[i]-64;
	}

	cout<<total;

	return 0;
}