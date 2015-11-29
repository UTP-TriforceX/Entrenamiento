//1023 - Financial Management

#include <bits/stdc++.h>

using namespace std;

int main(){
	double a, b=0;

	for(int i=0; i<12; i++){
		cin>>a;
		b=a+b;
	}

	cout<<"$"<<b/12.0<<"\n";

	return 0;
}