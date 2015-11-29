//2734 - Coco-Bits and Maths

#include <bits/stdc++.h>

using namespace std;

int main(){
	string x;
	int y, total=0;

	while(cin>>x>>y){
		if(x.compare("suma")==0){
			total=y+total;
		}
		else{
			total=total-y;
		}
	}

	cout<<"resultado: "<<total<<endl;

	return 0;
}