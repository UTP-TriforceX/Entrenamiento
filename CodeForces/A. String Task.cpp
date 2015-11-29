//A. String Task
//http://codeforces.com/problemset/problem/118/A

#include <bits/stdc++.h>

using namespace std;

bool vocal(char a){
	if(a=='A' || a=='a' || a=='O' || a=='o' || a=='Y' || a=='y' || a=='E' || a=='e' || a=='U' || a=='u' || a=='I' || a=='i'){
		return true;
	}
	else return false;
}

int main(){
	string x, y;

	cin>>x;
	for(int i=0; i<x.length(); i++){
		if(!vocal(x[i])){
			y.push_back('.');
			if(x[i]<91){
				x[i]=x[i]+32;
				y.push_back(x[i]);
			}
			else{
				y.push_back(x[i]);
			}
		}
	}

	cout<<y<<endl;

	return 0;
}