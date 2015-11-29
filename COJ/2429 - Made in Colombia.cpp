#include <bits/stdc++.h>

using namespace std;

long toLong (string &x){
	stringstream s;
	s<<x;
	long r;
	s>>r;
	return r;
}

int find(vector <long> &num, long  dato){
	int index=0;
	for(int i=0; i<num.size(); i++){
		if(num[i]== dato){
			index=i;
			return index;
		}
	}
	return -1;
}

int main(){
	int tam;
	while(cin>>tam && tam!=0){
		vector <long> num(tam);
		vector <long> num2;
		double  cont=0;
		for(int i=0; i<tam; i++)cin>>num[i];
		num2=num;
		sort(num2.begin(),num2.end());
		int index=0;
		long dato=0;
		while(num2.size()>0){
			if(num2.size() %2 == 0){
				index=num2.size()/2 -1;
				
			}
			else index=num2.size()/2;
			dato=num[num.size()-1];	
			cont+=(double)num2[index];
			num2.erase(num2.begin()+ find(num2,dato));
			num.erase(num.begin()+num.size()-1);
			
		}
		double prom=(cont/tam);
		printf("%.2lf\n",prom);
	}
	return 0;
}