//1059 - Numeric Parity

#include <bits/stdc++.h>

using namespace std;

void binary (int x){
	vector<int> dos(1000);
	int i=0, total, cont=0, j;
	if(x==1){
		dos[i]=x;
	}

	else{
		while((x/2)>=2){
			dos[i]=(x%2);
			x=x/2;
			i++;
		}
		dos[i]=x%2;
		i++;
		dos[i]=x/2;
	}
	
	j=i;
	for(j; j>=0; j--){
		cont=dos[j]+cont;
	}

	cout<<"The parity of ";
	while(i>=0){
		cout<<dos[i];
		i--;
	}

	cout<<" is "<<cont<<" (mod 2)."<<endl;
}

int main(){
	int n;

	while(cin>>n){
		if(n!=0)
			binary(n);
		else break;
	}
	return 0;
}