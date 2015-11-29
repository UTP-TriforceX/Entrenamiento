//2147 - Displacing Characters
//http://coj.uci.cu/24h/problem.xhtml?abb=2147

#include <bits/stdc++.h>

using namespace std;

int main(){
	int t, num;
	string s;
	
	cin>>t;
	
	for(int i=0; i<t; i++){
		cin>>s>>num;
		
		if(num==0 || num%s.length()==0){
			cout<<s<<endl;
		}
		else{
			for(int i=(s.length()-(num%s.length())); i<s.length(); i++){
				cout<<s[i];
			}
			for(int i=0; i<s.length()-(num%s.length()); i++){
				cout<<s[i];
			}
			cout<<endl;
		} 
	}
	
	return 0;
}
