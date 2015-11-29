//1177 - Group Reverse

#include <bits/stdc++.h>

using namespace std;

int main(){
	int g=1, cont=0, inf;
	string x, sub1, sub2;

	while(g>0){
		inf=0;
		cin>>g;
		if(g==0)
			break;
		else{
			cin>>x;
			cont=x.length()/g;

			for(int i=1; i<=g; i++){
				sub1=x.substr(inf, cont);
				sub2 = string(sub1.rbegin(), sub1.rend());
				cout<<sub2;
				inf=inf+cont;
			}
		}
		cout<<endl;
	}

	return 0;
}