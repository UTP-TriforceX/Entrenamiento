//1176 - Ternary

#include <bits/stdc++.h>

using namespace std;

void ternary (int x){
	vector<int> tres(1000);
	int i=0;

	while((x/3)>=3){
		tres[i]=(x%3);
		x=x/3;
		i++;
	}
	tres[i]=x%3;
	i++;
	tres[i]=x/3;

	while(i>=0){
		cout<<tres[i];
		i--;
	}
	cout<<endl;
}

int main(){
	int n=0;

	while(n>=0){
		cin>>n;
		if(n<0) break;

		ternary(n);
	}
	return 0;
}