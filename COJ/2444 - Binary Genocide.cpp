//2444 - Binary Genocide

#include <bits/stdc++.h>

using namespace std;

bool binary (int x){
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

	if(cont%2==0)
		return false;
	else
		return true;
}

int main(){
	int n, total=0;

	while(cin>>n){
			if(!binary(n))
				total++;
	}
	cout<<total<<endl;

	return 0;
}