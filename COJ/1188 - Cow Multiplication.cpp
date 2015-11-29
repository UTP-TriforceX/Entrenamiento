//1188 - Cow Multiplication

#include <bits/stdc++.h>

using namespace std;

int convertir(char x){
	if(x=='0') return 0;
	if(x=='1') return 1;
	if(x=='2') return 2;
	if(x=='3') return 3;
	if(x=='4') return 4;
	if(x=='5') return 5;
	if(x=='6') return 6;
	if(x=='7') return 7;
	if(x=='8') return 8;
	if(x=='9') return 9;
}

int main(){
	string a, b;
	int total=0;

	cin>>a>>b;

	for(int i=0; i<a.length(); i++){
		for(int j=0; j<b.length();j++){
			total+=convertir(a[i])*convertir(b[j]);
		}
	}

	cout<<total;

	return 0;
}