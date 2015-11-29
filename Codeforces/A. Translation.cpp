//A. Translation
//http://codeforces.com/problemset/problem/41/A

#include <bits/stdc++.h>

using namespace std;

int main(){
	string s, t;

	cin>>s>>t;

	s=string(s.rbegin(), s.rend());

	if(s.compare(t)==0){
		cout<<"YES"<<endl;
	}
	else{
		cout<<"NO"<<endl;
	}

	return 0;
}