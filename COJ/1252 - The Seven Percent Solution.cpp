//1252 - The Seven Percent Solution
//http://coj.uci.cu/24h/problem.xhtml?abb=1252

#include <bits/stdc++.h>

using namespace std;

int main(){
	string x, aux;

	while(getline(cin, x)){
		aux="";
		if(x[0]=='#'){
			break;
		}
		else{
			for(int i=0; i<x.length(); i++){
				if(x[i]==' '){
					aux.push_back('%');
					aux.push_back('2');
					aux.push_back('0');
				}
				else{
					if(x[i]=='!'){
						aux.push_back('%');
						aux.push_back('2');
						aux.push_back('1');
					}
					else{
						if(x[i]=='$'){
							aux.push_back('%');
							aux.push_back('2');
							aux.push_back('4');
						}
						else{
							if(x[i]=='%'){
								aux.push_back('%');
								aux.push_back('2');
								aux.push_back('5');
							}
							else{
								if(x[i]=='('){
									aux.push_back('%');
									aux.push_back('2');
									aux.push_back('8');
								}
								else{
									if(x[i]==')'){
										aux.push_back('%');
										aux.push_back('2');
										aux.push_back('9');
									}
									else{
										if(x[i]=='*'){
											aux.push_back('%');
											aux.push_back('2');
											aux.push_back('a');
										}
										else{
											aux.push_back(x[i]);
										}
									}
								}
							}
						}
					}
				}
			}
			cout<<aux<<endl;
		}
	}

	return 0;
}