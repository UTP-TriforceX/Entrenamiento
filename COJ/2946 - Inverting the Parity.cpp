//2946 - Inverting the Parity
//http://coj.uci.cu/24h/problem.xhtml?abb=2946

#include <bits/stdc++.h>

using namespace std;

int main(){
	long t, n;
	cin>>t;
	
	for(int i=0; i<t; i++){
		cin>>n;
		
		if(n%2>0){
			n=n*2;
		}
		else{
			while(n>1){
				if(n%2==0){
					n=n/2;
				}
				else{
					break;
				}
			}
		}
		cout<<n<<endl;
	}
	
	return 0;
}
