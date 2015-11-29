//A. Word Capitalization

#include <bits/stdc++.h>

using namespace std;

int main(){
	string x;

	cin>>x;

	if(x[0]>90){
		x[0]=x[0]-32;
	}

	cout<<x<<endl;

	return 0;
}