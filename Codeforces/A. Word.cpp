//A. Word
//http://codeforces.com/problemset/problem/59/A

#include <bits/stdc++.h>

using namespace std;

int main(){
	int minus=0, mayus=0;
	string x;

	cin>>x;

	for(int i=0; i<x.length(); i++){
		if(x[i]<91){
			mayus++;
		}
		else{
			minus++;
		}
	}

	if(mayus>minus){
		for(int i=0; i<x.length(); i++){
			if(x[i]>90){
				x[i]=x[i]-32;
			}
		}
	}
	else{
		for(int i=0; i<x.length(); i++){
			if(x[i]<91){
				x[i]=x[i]+32;
			}
		}
	}

	cout<<x<<endl;

	return 0;
}