//A. HQ9+
//http://codeforces.com/problemset/problem/133/A

#include <bits/stdc++.h>

using namespace std;

bool valid(char a){
	if(a=='H' || a=='Q' || a=='9'){
		return true;
	}
	else return false;
}

int main(){
	string x;
	int cont=0;

	cin>>x;
	for(int i=0; i<x.length(); i++){
		if(valid(x[i])){
			cont++;
		}
	}

	if(cont>0){
		cout<<"YES"<<endl;
	}
	else{
		cout<<"NO"<<endl;
	}

	return 0;
}