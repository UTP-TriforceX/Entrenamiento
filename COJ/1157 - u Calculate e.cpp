//1157 - u Calculate e
//http://coj.uci.cu/24h/problem.xhtml?abb=1157

#include <bits/stdc++.h>

using namespace std;

int factorial(int n){
	vector <float> vec(10);

	for(int i=1; i<10; i++){
		vec[0]=1.0;
		vec[i]=vec[i-1]*i;
	}

	return vec[n];
}

int main(){
	vector <double> e(10);

	for(int i=1; i<10; i++){
		e[0]=1.0/(factorial(0));
		e[i]=1.0/(factorial(i))+e[i-1];
	}

	cout<<"n e"<<endl;
	cout<<"- -----------"<<endl;

	for(int i=0; i<3; i++){
		cout<<i<<" "<<e[i]<<endl;
	}
	for(int i=3; i<10; i++){
		printf("%d %.9f\n",i, e[i]);
	}

	return 0;
}