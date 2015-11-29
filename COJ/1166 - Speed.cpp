//1166 - Speed

#include <bits/stdc++.h>

using namespace std;

int main(){
	int t, n, num, even, odd;

	cin>>t;

	for (int i=0; i<t; i++){
		even=0, odd=0;
		cin>>n;
		for (int i=0; i<n; i++){
			cin>>num;
			if(num%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		cout<<even<<" even and "<<odd<<" odd.\n";
	}

	return 0;
}