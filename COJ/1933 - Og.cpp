

#include <bits/stdc++.h>

using namespace std;

int main(){
	string s;
	double a, b;

	cin>>s;

	if(s.compare("circle")==0){
		cin>>a;
		cout<<3.14*(a*a)<<endl;
	}

	if(s.compare("rhombus")==0){
		cin>>a>>b;
		cout<<(a*b)/2<<endl;
	}
	else{
		cin>>a>>b;
		cout<<(a*b)/2<<endl;
	}

	return 0;
}