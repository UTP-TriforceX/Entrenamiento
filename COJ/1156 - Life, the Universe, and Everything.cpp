//1156 - Life, the Universe, and Everything

#include <bits/stdc++.h>

using namespace std;

int main(){
	int x;
	bool flag=false;

	while(cin>>x){
		if(x!=42){
			if(flag==false){
				cout<<x<<"\n";
			}
		}
		else{
			flag=true;
		}
	}

	return 0;
}