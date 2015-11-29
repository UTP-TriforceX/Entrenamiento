//1012 - Guilty Prince

#include <bits/stdc++.h>

using namespace std;

char ways [20][20];

int BFS(int h, int w){
	int posx=0,posy=0,cont=0;
	queue <pair <int,int> > cola;
	for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
			if(ways[i][j]== '@'){
				posx=i;
				posy=j;
			}
		}
	}
	cola.push(make_pair(posx,posy));
	cont=0;
	while(!cola.empty()){
		posx= cola.front().first;
		posy= cola.front().second;
		if(posx > 0 )
			if(ways[posx-1][posy] == '.'){
				cola.push(make_pair(posx-1,posy));
			    ways[posx-1][posy]='#';
			    
			}

		if(posy > 0)
			if(ways[posx][posy-1] == '.'){
				cola.push(make_pair(posx,posy-1));
		   	 	ways[posx][posy-1]='#';
		 
			}

		if(posx < h-1)
			if(ways[posx+1][posy] == '.'){
				cola.push(make_pair(posx+1,posy));
		    	ways[posx+1][posy]='#';
			}

		if(posy < w-1)
			if(ways[posx][posy+1] == '.'){
				cola.push(make_pair(posx,posy+1));
		    	ways[posx][posy+1]='#';
		    	
			}

		cont++;
		cola.pop();

	}
	return cont;    

}

int main(){
	int t,res=0;
	cin>>t;
	while(t--){
		int w,h,b=0;
		cin>>h>>w;
		for(int i=0; i<w; i++){
			for(int j=0; j<h; j++){
				cin>>ways[i][j]; 
			}
		}
		b=BFS(w,h);
		cout<<"Case "<<++res<<": "<<b<<endl;
		b=0;

	}
	return 0;
}