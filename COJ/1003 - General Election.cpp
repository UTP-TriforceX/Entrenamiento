//1003 - General Election

#include <bits/stdc++.h>

using namespace std;

int main(){
	int t, n, m, x;
	vector <int> vect (5);
	vector <int> vecCopy (5);

	cin>>t;

	for(int i =0; i<t; i++){
		cin>>n>>m;

		for(int i=0; i<5; i++){
			vect[i]=0;
			vecCopy[i]=0;
		}

		for(int i=0; i<m; i++){
			for(int i=0; i<n; i++){
				cin>>x;
				vect[i]+=x;
				vecCopy[i]+=x;
			}
		}

		sort(vect.begin(),vect.end());

		for(int i=0; i<5; i++){
			if(vecCopy[i]==vect[4]){
				cout<<i+1<<"\n";
			}
		}

	}

	return 0;
}