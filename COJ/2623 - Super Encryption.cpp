//2623 - Super Encryption

#include <bits/stdc++.h>

using namespace std;

int main(){
	string x, sub1, sub2;

	cin>>x;
	int n=x.length();

	if(n>3){
		if(n%2==0){
			sub1=x.substr(0, n/2);
			sub2=x.substr(n/2, n/2);

			sub1=string(sub1.rbegin(), sub1.rend());
			sub2=string(sub2.rbegin(), sub2.rend());
			cout<<sub1<<sub2<<endl;
		}
		else{
			sub1=x.substr(0, n/2);
			sub2=x.substr((n/2)+1, n/2);

			sub1=string(sub1.rbegin(), sub1.rend());
			sub2=string(sub2.rbegin(), sub2.rend());
			cout<<sub1<<x[n/2]<<sub2<<endl;
		}
	}
	else{
		cout<<x<<endl;
	}

	return 0;
}