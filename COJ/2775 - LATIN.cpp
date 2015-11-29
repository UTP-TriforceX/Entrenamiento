//2775 - LATIN
//http://coj.uci.cu/24h/problem.xhtml?abb=2775

#include <bits/stdc++.h>

using namespace std;

bool vocal(char a){
	if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') return true;
	else return false;
}

int main(){
	int n;
	string x;

	cin>>n;
	for(int i=0; i<n; i++){
		cin>>x;
		if(!vocal(x[0])){
			x.push_back(x[0]);
			x.push_back('o');
			x.push_back('w');
			x.erase(0,1);
		}
		else{
			x.push_back('c');
			x.push_back('o');
			x.push_back('w');
		}

		cout<<x<<endl;
	}

	return 0;
}