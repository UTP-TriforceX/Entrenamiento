//A. Football
//http://codeforces.com/problemset/problem/96/A

#include <bits/stdc++.h>

using namespace std;

int main(){
	string x;
	int uno=0, cero=0;
	bool flag=false;

	cin>>x;

	for(int i=0; i<x.length(); i++){
		if(x[i]=='0'){
			cero++;
			uno=0;
		}
		if(x[i]=='1'){
			uno++;
			cero=0;
		}

		if(cero==7 || uno==7){
			flag=true;
		}
	}

	if(flag){
			cout<<"YES"<<endl;
		}
		else{
			cout<<"NO"<<endl;
		}

	return 0;
}