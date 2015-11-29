//1099 - Pythagorean Numbers

#include <bits/stdc++.h>

using namespace std;

int main(){
	int a, b, c;

	while(cin>>a){
		if(a!=0){
			cin>>b>>c;

			if(((a*a)+(b*b)==(c*c))||((a*a)+(c*c)==(b*b))||((b*b)+(c*c)==(a*a))){
				cout<<"right\n";
			}
			else{
				cout<<"wrong\n";
			}
		}
		else break;
	}

	return 0;
}