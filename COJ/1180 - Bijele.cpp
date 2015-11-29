//1180 - Bijele

#include <bits/stdc++.h>

using namespace std;

int king(int x){
	if(x==1) 
		return 0;
	else{
		return 1-x; 
	}
}

int queen(int x){
	if(x==1) 
		return 0;
	else{
		return 1-x; 
	}
}

int rooks(int x){
	if(x==2) 
		return 0;
	else{
		return 2-x; 
	}
}

int bishops(int x){
	if(x==2) 
		return 0;
	else{
		return 2-x; 
	}
}

int knights(int x){
	if(x==2) 
		return 0;
	else{
		return 2-x; 
	}
}

int pawns(int x){
	if(x==8) 
		return 0;
	else{
		return 8-x; 
	}
}

int main(){
	int t, ki, qu, ro, bi, kn, pa;

	cin>>t;

	for(int i=0; i<t; i++){
		cin>>ki>>qu>>ro>>bi>>kn>>pa;
		cout<<king(ki)<<" "<<queen(qu)<<" "<<rooks(ro)<<" "<<bishops(bi)<<" "<<knights(kn)<<" "<<pawns(pa)<<endl;
	}

	return 0;
}