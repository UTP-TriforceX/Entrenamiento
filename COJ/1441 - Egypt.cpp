//1441 - Egypt

#include <bits/stdc++.h>

using namespace std;

int main(){
	int a, b, c;

	while(cin>>a>>b>>c){
		if(a!=0&&b!=0&&c!=0){

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