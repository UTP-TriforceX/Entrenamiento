//1495 - Increasing Order List

#include <bits/stdc++.h>

using namespace std;

int main(){
	int n, x;
	vector<int> vec(1000);

	cin>>n;

	for(int i=0; i<n; i++){
		cin>>x;
		vec[i]=x;
	}

	sort(vec.begin(), vec.end());

	for(int i=0; i<n; i++){
		cout<<vec[1000-n+i]<<"\n";
	}

	return 0;
}