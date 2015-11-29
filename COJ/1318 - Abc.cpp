//1318 - Abc

#include <bits/stdc++.h>

using namespace std;

int main(){
	int y;
	string x;
	vector <int> abc(3);

	for(int i=0; i<3; i++){
		cin>>y;
		abc[i]=y;
	}

	sort(abc.begin(), abc.end());
	cin>>x;

	for(int i=0; i<3; i++){
		if(x[i]=='A'){
			cout<<abc[0];
			if(i<2)
				cout<<" ";
		}
		if(x[i]=='B'){
			cout<<abc[1];
			if(i<2)
				cout<<" ";
		}
		if(x[i]=='C'){
			cout<<abc[2];
			if(i<2)
				cout<<" ";
		}
	}

	return 0;
}