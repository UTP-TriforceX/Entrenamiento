//A. Boy or Girl
//http://codeforces.com/problemset/problem/236/A

#include <bits/stdc++.h>

using namespace std;

bool search(string a, char b){
	bool flag=false;

	for(int i=0; i<a.length(); i++){
		if(a[i]==b){
			flag=true;
		}
	}

	return flag;
}

int main(){
	string x, y;

	cin>>x;
	for(int i=0; i<x.length(); i++){
		if(!search(y, x[i])){
			y.push_back(x[i]);
		}
	}

	if(y.length()%2==0){
		cout<<"CHAT WITH HER!"<<endl;
	}
	else{
		cout<<"IGNORE HIM!"<<endl;
	}

	return 0;
}