//1484 - Hotest Mountain

#include <bits/stdc++.h>

using namespace std;

int main(){
	float x;
	int t, mayor=0;
	vector<float> temp(1001);

	cin>>t;

	for(int i=0; i<t; i++){
		cin>>x;
		temp[i]=x;

		if(temp[i]>=temp[mayor]){
			mayor=i;
		}
	}

	cout<<mayor+1<<endl;

	return 0;
}