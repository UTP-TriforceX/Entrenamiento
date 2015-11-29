//1483 - Geometrical Task I

#include <bits/stdc++.h>

using namespace std;

int main(){
	int a, b;
	string x;

	cin>>x;

	if(x.compare("square")==0){
		cin>>a;
		cout<<a*a;
	}
	else{
		cin>>a>>b;
		cout<<a*b;
	}

	return 0;
}