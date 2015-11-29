//2789 - Sum Order
//http://coj.uci.cu/24h/problem.xhtml?abb=2789

#include <bits/stdc++.h>

using namespace std;


//Convertir Cadena a Entero
int toInt(string x){
	stringstream s;
	s<<x;
	int r;
	s>>r;
	return r;
}


int main(){
	string x, y;
	vector<int> a;
	int b;

	cin>>x;

	for(int i=0; i<x.length(); i++){
		if(x[i]=='+'){
			b=toInt(y);
			a.push_back(b);
			y=' ';
		}
		else{
			y.push_back(x[i]);
			if(i==(x.length()-1)){
				b=toInt(y);
				a.push_back(b);
			}
		}
	}

	sort(a.begin(), a.end());

	for(int i=0; i<a.size()-1; i++){
		cout<<a[i]<<'+';
	}
	cout<<a[a.size()-1];

	return 0;
}